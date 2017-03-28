package no.fint.provider.bluegarden.service;

import lombok.extern.slf4j.Slf4j;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.provider.bluegarden.service.mapper.ArbeidsforholdMapperService;
import no.fint.provider.bluegarden.service.mapper.PersonMapperService;
import no.fint.provider.bluegarden.service.mapper.PersonalressursMapperService;
import no.fint.provider.bluegarden.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@Service
public class BlueGardenService {

    @Value("${bluegarden.employee-endpoint}")
    private String employeeEnpoint;

    @Value("${bluegarden.username}")
    private String username;

    @Value("${bluegarden.password}")
    private String password;

    @Value("${bluegarden.employer}")
    private String employer;

    @Value("${bluegarden.orgunitid}")
    private String orgUnitId;

    @Value("${bluegarden.source-company}")
    private String sourceCompany;

    @Value("${bluegarden.source-system}")
    private String sourceSystem;

    @Value("${bluegarden.source-user}")
    private String sourceUser;

    @Value("${bluegarden.source-employer}")
    private String sourceEmployer;

    @Autowired
    private OrganisationService organisationService;

    @Autowired
    private PersonMapperService personMapperService;

    @Autowired
    private PersonalressursMapperService personalressursMapperService;

    @Autowired
    private ArbeidsforholdMapperService arbeidsforholdMapperService;

    private GetAnsattListSOAPQSService service;
    private GetAnsattList port;
    private Map<String, Object> requestContext;
    private BSBHeaderType header;
    private GetAnsattListRequestMessageType request;

    private List<Person> personList;
    private List<Arbeidsforhold> arbeidsforholdList;
    private List<Personalressurs> personalressursList;

    @PostConstruct
    public void init() {
        service = new GetAnsattListSOAPQSService();
        port = service.getGetAnsattListSOAPQSPort();
        requestContext = ((BindingProvider) port).getRequestContext();

        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, employeeEnpoint);
        requestContext.put(BindingProvider.USERNAME_PROPERTY, username);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);

        header = new BSBHeaderType();
        //header.setMessageId(UUID.randomUUID().toString()); // sporing, opprettes av klienten
        header.setSourceCompany(sourceCompany);
        header.setSourceSystem(sourceSystem);
        header.setSourceUser(sourceUser); // innlogget bruker, sporing av klienten som sender request
        // employer("*")
        header.getSourceEmployer().add(sourceEmployer);
        header.setUserArea(new UserAreaType());

        request = new GetAnsattListRequestMessageType();
        request.setArbeidsgiver(employer);

    }

    public void getBlueGardenData() {

        Long startTimestamp = System.currentTimeMillis();
        Long endTimestamp;
        List<AnsattObject> employeeList = new ArrayList<>();
        List<OrgListItemObject> orgListItemObjects = organisationService.getOrganisationStructure();

        orgListItemObjects.forEach(org -> {
            if (org.isErAktiv()) {
                log.info("Getting employees for -- {}", org.getOrgNavn());
                employeeList.addAll(getEmployeesByOrgUnit(org.getOrgUnitId()));
            } else {
                log.info("OrgUnit is not active", org.getOrgNavn());
            }
        });

        endTimestamp = System.currentTimeMillis();


        personList = personMapperService.personMapper(employeeList);
        arbeidsforholdList = arbeidsforholdMapperService.arbeidsforholdMapper(employeeList);
        personalressursList = personalressursMapperService.personalressursMapper(employeeList);

        log.info("Getting employees took {} seconds", (endTimestamp - startTimestamp) / 1000);

    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Personalressurs> getPersonalressursList() {
        return personalressursList;
    }

    public List<Arbeidsforhold> getArbeidsforholdList() {
        return arbeidsforholdList;
    }

    private List<AnsattObject> getEmployeesByOrgUnit(String orgUnitId) {
        request.setOrgUnitId(orgUnitId);
        header.setMessageId(UUID.randomUUID().toString());
        log.info("Sending getAnsattList request with MessageId: {} to Bluegarden.", header.getMessageId());
        GetAnsattListResultMessageType employees = port.getAnsattList(request, header);
        return employees.getAnsattList().getAnsatt();

    }


}
