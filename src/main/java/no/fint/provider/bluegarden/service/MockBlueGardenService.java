package no.fint.provider.bluegarden.service;

import lombok.extern.slf4j.Slf4j;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.model.relation.FintResource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Profile("test")
@Service
public class MockBlueGardenService implements BlueGardenService {

    @PostConstruct
    public void init() {
        log.info("Started with MockBlueGardenService");
    }

    @Override
    public void getBlueGardenData() {
    }

    @Override
    public List<FintResource<Person>> getPersonList() {
        return null;
    }

    @Override
    public List<FintResource<Personalressurs>> getPersonalressursList() {
        return null;
    }

    @Override
    public List<FintResource<Arbeidsforhold>> getArbeidsforholdList() {
        return null;
    }
}
