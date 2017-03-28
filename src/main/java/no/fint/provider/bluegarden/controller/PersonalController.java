package no.fint.provider.bluegarden.controller;

import lombok.extern.slf4j.Slf4j;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.model.relation.Relation;
import no.fint.provider.bluegarden.service.BlueGardenService;
import no.fint.provider.bluegarden.service.RelationService;
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
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
public class PersonalController {

    @Autowired
    private BlueGardenService blueGardenService;

    @Autowired
    private RelationService relationService;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> getPersonList() {
        return blueGardenService.getPersonList();
    }

    @RequestMapping(value = "/personalressurs", method = RequestMethod.GET)
    public List<Personalressurs> getPersonalressursList() {
        return blueGardenService.getPersonalressursList();
    }

    @RequestMapping(value = "/arbeidsforhold", method = RequestMethod.GET)
    public List<Arbeidsforhold> getArbeidsforholdList() {
        return blueGardenService.getArbeidsforholdList();
    }

    @RequestMapping(value = "/relasjoner", method = RequestMethod.GET)
    public List<Relation> getRelationList() {
        return relationService.getRelations();
    }

    @RequestMapping(value = "/refresh", method = RequestMethod.GET)
    public void refresh() {
        blueGardenService.getBlueGardenData();
    }
}
