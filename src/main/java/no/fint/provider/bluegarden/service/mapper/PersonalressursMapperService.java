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

@Service
public class PersonalressursMapperService {

    public List<FintResource<Personalressurs>> personalressursMapper(List<AnsattObject> ansattObjectList) {

        List<FintResource<Personalressurs>> personalressursList = new ArrayList<>();

        ansattObjectList.forEach(ansattObject -> {
            FintResource<Personalressurs> fintResource = new FintResource<>();
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

            fintResource.with(personalressurs)
                    .addRelasjon(
                            new Relation.Builder()
                                    .with(Personalressurs.Relasjonsnavn.PERSON)
                                    .forType(Person.class)
                                    .path("/administrasjon/personal/person")
                                    .field("fodselsnummer")
                                    .value(ansattObject.getFodselsnummer())
                                    .build()
                    );

            ansattObject.getArbeidsforhold().forEach(arbeidsforholdType -> {

                fintResource.addRelasjon(
                        new Relation.Builder()
                                .with(Personalressurs.Relasjonsnavn.ARBEIDSFORHOLD)
                                .forType(Arbeidsforhold.class)
                                .path("/administrasjon/personal/arbeidsforhold")
                                .field("systemid")
                                .value(ArbeidsforholSystemIdUtility.getSystemId(ansattObject.getAnsattNummer(), arbeidsforholdType.getArbeidsforholdnummer()))
                                .build()
                );

            });


            personalressursList.add(fintResource);
        });

        return personalressursList;
    }
}
