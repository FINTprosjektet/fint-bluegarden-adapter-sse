package no.fint.provider.bluegarden.controller;

import com.google.common.collect.ImmutableList;
import lombok.extern.slf4j.Slf4j;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.model.relation.FintResource;
import no.fint.provider.bluegarden.service.BlueGardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class PersonalController {

    @Autowired
    private BlueGardenService blueGardenService;

    @GetMapping("/person")
    public List<FintResource<Person>> getPersonList() {
        return blueGardenService.getPersonList();
    }

    @GetMapping("/personalressurs")
    public List<FintResource<Personalressurs>> getPersonalressursList(@RequestParam(required = false) String ansattnummer) {
        List<FintResource<Personalressurs>> personalressursList = blueGardenService.getPersonalressursList();
        if (StringUtils.isEmpty(ansattnummer)) {
            return personalressursList;
        } else {
            Optional<FintResource<Personalressurs>> personalressurs = personalressursList.stream()
                    .filter(resource -> ansattnummer.equals(resource.getResource().getAnsattnummer().getIdentifikatorverdi())).findFirst();
            return personalressurs.<List<FintResource<Personalressurs>>>map(ImmutableList::of).orElseGet(Collections::emptyList);
        }
    }

    @GetMapping("/arbeidsforhold")
    public List<FintResource<Arbeidsforhold>> getArbeidsforholdList(@RequestParam(required = false) String systemId) {
        List<FintResource<Arbeidsforhold>> arbeidsforholdList = blueGardenService.getArbeidsforholdList();
        if (StringUtils.isEmpty(systemId)) {
            return arbeidsforholdList;
        } else {
            Optional<FintResource<Arbeidsforhold>> arbeidsforhold = arbeidsforholdList.stream()
                    .filter(resource -> systemId.equals(resource.getResource().getSystemId().getIdentifikatorverdi())).findFirst();
            return arbeidsforhold.<List<FintResource<Arbeidsforhold>>>map(ImmutableList::of).orElseGet(Collections::emptyList);
        }
    }

    @GetMapping("/refresh")
    public void refresh() {
        blueGardenService.getBlueGardenData();
    }
}
