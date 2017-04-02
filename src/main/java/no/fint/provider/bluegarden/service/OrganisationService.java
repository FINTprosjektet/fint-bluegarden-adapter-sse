package no.fint.provider.bluegarden.service;

import lombok.extern.slf4j.Slf4j;
import no.fint.provider.bluegarden.soap.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.ws.BindingProvider;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@Service
public class OrganisationService {

    @Value("${bluegarden.org-endpoint}")
    private String orgEnpoint;

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


    public List<OrgListItemObject> getOrganisationStructure() {
        BasicHttpBindingIOrgStructureServiceQSService service = new BasicHttpBindingIOrgStructureServiceQSService();
        IOrgStructureService port = service.getBasicHttpBindingIOrgStructureServiceQSPort();
        Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();

        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, orgEnpoint);
        requestContext.put(BindingProvider.USERNAME_PROPERTY, username);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);

        GetOrgListRequest request = new GetOrgListRequest();
        request.setArbeidsgiver(employer);
        request.setOrgUnitId(orgUnitId);

        BSBHeaderType header = new BSBHeaderType();
        header.setMessageId(UUID.randomUUID().toString()); // sporing, opprettes av klienten
        header.setSourceCompany(sourceCompany);
        header.setSourceSystem(sourceSystem);
        header.setSourceUser(sourceUser); // innlogget bruker, sporing av klienten som sender request
        // employer("*")
        header.getSourceEmployer().add(sourceEmployer);
        header.setUserArea(new UserAreaType());

        log.info("Sending getOrgList request with MessageId: {} to Bluegarden.", header.getMessageId());
        GetOrgListResponse orgListResponse = port.getOrgList(request, header);

        return orgListResponse.getOrgList().get(0).getOrgUnit();


    }
}
