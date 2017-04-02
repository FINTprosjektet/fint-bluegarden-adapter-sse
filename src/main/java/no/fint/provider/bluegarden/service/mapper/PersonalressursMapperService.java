package no.fint.provider.bluegarden.service.mapper;

import no.fint.model.administrasjon.kodeverk.Personalressurskategori;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.model.felles.Person;
import no.fint.model.relation.FintResource;
import no.fint.model.relation.Relation;
import no.fint.provider.bluegarden.soap.AnsattObject;
import no.fint.provider.bluegarden.utilities.ArbeidsforholSystemIdUtility;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonalressursMapperService {

    public List<FintResource<Personalressurs>> personalressursMapper(List<AnsattObject> ansattObjectList) {

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


            List<Relation> arbeidsforholdRelasjoner = ansattObject.getArbeidsforhold().stream().map(arbeidsforholdType -> {

                return new Relation.Builder()
                                .with(Personalressurs.Relasjonsnavn.ARBEIDSFORHOLD)
                                .forType(Arbeidsforhold.class)
                                .path("/administrasjon/personal/arbeidsforhold")
                                .field("systemid")
                                .value(ArbeidsforholSystemIdUtility.getSystemId(ansattObject.getAnsattNummer(), arbeidsforholdType.getArbeidsforholdnummer()))
                                .build();

            }).collect(Collectors.toList());
            arbeidsforholdRelasjoner.add( new Relation.Builder()
                    .with(Personalressurs.Relasjonsnavn.PERSON)
                    .forType(Person.class)
                    .path("/administrasjon/personal/person")
                    .field("fodselsnummer")
                    .value(ansattObject.getFodselsnummer())
                    .build());

            FintResource<Personalressurs> fintResource = FintResource.with(personalressurs);
            fintResource.setRelasjoner(arbeidsforholdRelasjoner);

            personalressursList.add(fintResource);
        });

        return personalressursList;
    }
}
