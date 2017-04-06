package no.fint.provider.bluegarden.service;

import lombok.extern.slf4j.Slf4j;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.model.relation.FintResource;
import no.fint.provider.bluegarden.service.mapper.ArbeidsforholdMapper;
import no.fint.provider.bluegarden.service.mapper.PersonMapper;
import no.fint.provider.bluegarden.service.mapper.PersonalressursMapper;
import no.fint.provider.bluegarden.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@Profile("!test")
@Service
public class DefaultBlueGardenService implements BlueGardenService {
    @Autowired
    private BlueGardenProps bluegardenProps;

    @Autowired
    private OrganisationService organisationService;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private PersonalressursMapper personalressursMapper;

    @Autowired
    private ArbeidsforholdMapper arbeidsforholdMapper;

    private GetAnsattListSOAPQSService service;
    private GetAnsattList port;
    private Map<String, Object> requestContext;
    private BSBHeaderType header;
    private GetAnsattListRequestMessageType request;

    private List<FintResource<Person>> personList;
    private List<FintResource<Arbeidsforhold>> arbeidsforholdList;
    private List<FintResource<Personalressurs>> personalressursList;

    @PostConstruct
    public void init() {
        log.info("Started with DefaultBlueGardenService");

        service = new GetAnsattListSOAPQSService();
        port = service.getGetAnsattListSOAPQSPort();
        requestContext = ((BindingProvider) port).getRequestContext();

        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bluegardenProps.getEmployeeEnpoint());
        requestContext.put(BindingProvider.USERNAME_PROPERTY, bluegardenProps.getUsername());
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, bluegardenProps.getPassword());

        header = new BSBHeaderType();
        //header.setMessageId(UUID.randomUUID().toString()); // sporing, opprettes av klienten
        header.setSourceCompany(bluegardenProps.getSourceCompany());
        header.setSourceSystem(bluegardenProps.getSourceSystem());
        header.setSourceUser(bluegardenProps.getSourceUser()); // innlogget bruker, sporing av klienten som sender request
        // employer("*")
        header.getSourceEmployer().add(bluegardenProps.getSourceEmployer());
        header.setUserArea(new UserAreaType());

        request = new GetAnsattListRequestMessageType();
        request.setArbeidsgiver(bluegardenProps.getEmployer());

        try {
            getBlueGardenData();
        } catch (Exception ignore) {
            getBlueGardenData();
        }

    }

    @Scheduled(initialDelay = 600000L, fixedRate = 600000L)
    public void getBlueGardenDataScheduled() {
        if (bluegardenProps.isSchedulingEnabled()) {
            getBlueGardenData();
        }
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


        personList = personMapper.convertToResource(employeeList);
        arbeidsforholdList = arbeidsforholdMapper.convertToResource(employeeList);
        personalressursList = personalressursMapper.convertToResource(employeeList);

        log.info("Getting employees took {} seconds", (endTimestamp - startTimestamp) / 1000);
    }

    public List<FintResource<Person>> getPersonList() {
        return personList;
    }

    public List<FintResource<Personalressurs>> getPersonalressursList() {
        return personalressursList;
    }

    public List<FintResource<Arbeidsforhold>> getArbeidsforholdList() {
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
