package no.fint.provider.bluegarden.controller;

import lombok.extern.slf4j.Slf4j;
import no.fint.provider.bluegarden.service.OrganisationService;
import no.fint.provider.bluegarden.soap.OrgListItemObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/organisation", produces = {MediaType.APPLICATION_JSON_VALUE})
public class OrganisationController {

    @Autowired
    OrganisationService organisationService;

    @RequestMapping(method = RequestMethod.GET)
    public List<OrgListItemObject> getOrganisationList() {
        return organisationService.getOrganisationStructure();
    }
}
