package no.fint.provider.bluegarden.controller;

import lombok.extern.slf4j.Slf4j;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.model.relation.FintResource;
import no.fint.provider.bluegarden.service.BlueGardenService;
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
@RequestMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class PersonalController {

    @Autowired
    private BlueGardenService blueGardenService;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<FintResource<Person>> getPersonList() {
        return blueGardenService.getPersonList();
    }

    @RequestMapping(value = "/personalressurs", method = RequestMethod.GET)
    public List<FintResource<Personalressurs>> getPersonalressursList() {
        return blueGardenService.getPersonalressursList();
    }

    @RequestMapping(value = "/arbeidsforhold", method = RequestMethod.GET)
    public List<FintResource<Arbeidsforhold>> getArbeidsforholdList() {
        return blueGardenService.getArbeidsforholdList();
    }

    @RequestMapping(value = "/refresh", method = RequestMethod.GET)
    public void refresh() {
        blueGardenService.getBlueGardenData();
    }
}
