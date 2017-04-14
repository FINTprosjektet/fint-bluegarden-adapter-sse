package no.fint.provider.bluegarden.service.mapper;

import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.model.felles.Person;
import no.fint.model.relation.FintResource;
import no.fint.model.relation.Relation;
import no.fint.provider.bluegarden.soap.AnsattObject;
import no.fint.provider.bluegarden.utilities.ArbeidsforholdSystemIdUtility;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonalressursMapper {

    public List<FintResource<Personalressurs>> convertToResource(List<AnsattObject> ansattObjectList) {

        List<FintResource<Personalressurs>> personalressursList = new ArrayList<>();

        ansattObjectList.forEach(ansattObject -> {
            Personalressurs personalressurs = new Personalressurs();

            Identifikator ansattnummer = new Identifikator();
            ansattnummer.setIdentifikatorverdi(ansattObject.getAnsattNummer());
            personalressurs.setAnsattnummer(ansattnummer);

            Identifikator brukernavn = new Identifikator();
            brukernavn.setIdentifikatorverdi(String.format("A%s", ansattObject.getAnsattNummer()));
            personalressurs.setBrukernavn(brukernavn);

            Kontaktinformasjon kontaktInformasjon = new Kontaktinformasjon();
            String epost = String.format("%s.%s@hfk.no", ansattObject.getFornavn(), ansattObject.getEtternavn());
            kontaktInformasjon.setEpostadresse(epost);
            kontaktInformasjon.setSip(epost);
            kontaktInformasjon.setNettsted("http://www.hordaland.no/");
            kontaktInformasjon.setMobiltelefonummer(ansattObject.getMobiltelefon());
            personalressurs.setKontaktinformasjon(kontaktInformasjon);

            Periode ansettelsesperiode = new Periode();
            ansettelsesperiode.setSlutt(new Date());
            ansettelsesperiode.setStart(new Date());
            personalressurs.setAnsettelsesperiode(ansettelsesperiode);

            FintResource<Personalressurs> fintResource = createFintResource(ansattObject, personalressurs);
            personalressursList.add(fintResource);
        });

        return personalressursList;
    }

    private FintResource<Personalressurs> createFintResource(AnsattObject ansattObject, Personalressurs personalressurs) {
        List<Relation> arbeidsforholdRelasjoner = ansattObject.getArbeidsforhold().stream().map(arbeidsforholdType ->
                new Relation.Builder().with(Personalressurs.Relasjonsnavn.ARBEIDSFORHOLD)
                        .forType(Arbeidsforhold.class)
                        .field("systemid")
                        .value(ArbeidsforholdSystemIdUtility.getSystemId(ansattObject.getAnsattNummer(), arbeidsforholdType.getArbeidsforholdnummer()))
                        .build()).collect(Collectors.toList()
        );

        arbeidsforholdRelasjoner.add(new Relation.Builder().with(Personalressurs.Relasjonsnavn.PERSON)
                .forType(Person.class)
                .field("fodselsnummer")
                .value(ansattObject.getFodselsnummer())
                .build());

        return FintResource.with(personalressurs).addRelasjoner(arbeidsforholdRelasjoner);
    }
}
