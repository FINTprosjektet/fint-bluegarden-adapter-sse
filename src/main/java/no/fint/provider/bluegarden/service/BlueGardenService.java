package no.fint.provider.bluegarden.service;

import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.model.relation.FintResource;

import java.util.List;

public interface BlueGardenService {
    void getBlueGardenData();

    List<FintResource<Person>> getPersonList();

    List<FintResource<Personalressurs>> getPersonalressursList();

    List<FintResource<Arbeidsforhold>> getArbeidsforholdList();
}
