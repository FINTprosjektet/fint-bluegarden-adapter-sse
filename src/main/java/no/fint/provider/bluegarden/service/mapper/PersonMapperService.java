package no.fint.provider.bluegarden.service.mapper;

import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.*;
import no.fint.model.relation.FintResource;
import no.fint.model.relation.Relation;
import no.fint.provider.bluegarden.soap.AnsattObject;
import no.fint.provider.bluegarden.soap.KontaktinformasjonEnumType;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PersonMapperService {

    public List<FintResource<Person>> personMapper(List<AnsattObject> ansattObjectList) {

        List<FintResource<Person>> personList = new ArrayList<>();

        ansattObjectList.forEach(ansattObject -> {
            FintResource<Person> fintResource = new FintResource<>();
            Person person = new Person();

            Identifikator fodselsnummer = new Identifikator();
            fodselsnummer.setIdentifikatorverdi(ansattObject.getFodselsnummer());
            person.setFodselsnummer(fodselsnummer);

            Adresse adresse = new Adresse();

            ansattObject.getKontaktinformasjon().forEach(kontaktinformasjonType -> {

                if (kontaktinformasjonType.getKontaktinformasjonType().equals(KontaktinformasjonEnumType.BOSTEDSADRESSE)) {
                    adresse.setPostnummer(kontaktinformasjonType.getAdresse().getPostnummer());
                    adresse.setAdresse(kontaktinformasjonType.getAdresse().getAdresseLinje1());
                    adresse.setPoststed(kontaktinformasjonType.getAdresse().getPoststed());
                }

            });

            person.setBostedsadresse(adresse);
            person.setPostadresse(adresse);

            Kontaktinformasjon kontaktInformasjon = new Kontaktinformasjon();
            String epost = String.format("%s.%s@gmail.com", ansattObject.getFornavn(), ansattObject.getEtternavn());
            kontaktInformasjon.setEpostadresse(epost);
            kontaktInformasjon.setMobiltelefonummer(ansattObject.getMobiltelefon());
            person.setKontaktinformasjon(kontaktInformasjon);

            Date fodselsdato = getFodselsdato(ansattObject.getFodselsnummer());
            person.setFodselsdato(fodselsdato);

            Personnavn navn = new Personnavn();
            navn.setFornavn(ansattObject.getFornavn());
            navn.setEtternavn(ansattObject.getEtternavn());
            person.setNavn(navn);

            fintResource.with(person)
                    .addRelasjon(
                            new Relation.Builder()
                                    .with(Person.Relasjonsnavn.PERSONALRESSURS)
                                    .forType(Personalressurs.class)
                                    .field("ansattnummer")
                                    .value(ansattObject.getAnsattNummer())
                                    .build()
                    );
            personList.add(fintResource);

        });

        return personList;
    }

    private String getGender(String fodselsnummer) {
        if (Integer.valueOf(fodselsnummer.substring(10)) % 2 == 0) {
            return "2";
        } else {
            return "1";
        }
    }

    private Date getFodselsdato(String fodselsnummer) {
        String stringDate = fodselsnummer.substring(0, 6);
        DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
        try {
            return dateFormat.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }
}
