package no.fint.provider.bluegarden.service.mapper;

import lombok.extern.slf4j.Slf4j;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.*;
import no.fint.model.relation.FintResource;
import no.fint.model.relation.Relation;
import no.fint.provider.bluegarden.soap.AnsattObject;
import no.fint.provider.bluegarden.soap.KontaktinformasjonEnumType;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class PersonMapper {

    public List<FintResource<Person>> convertToResource(List<AnsattObject> ansattObjectList) {
        List<FintResource<Person>> personList = new ArrayList<>();
        ansattObjectList.forEach(ansattObject -> {
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

            FintResource<Person> fintResource = createFintResource(ansattObject, person);
            personList.add(fintResource);

        });

        return personList;
    }

    private Date getFodselsdato(String fodselsnummer) {
        String stringDate = fodselsnummer.substring(0, 6);
        DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
        try {
            return dateFormat.parse(stringDate);
        } catch (ParseException e) {
            log.error("Unable to parse date {}", stringDate);
            return new Date();
        }
    }

    private FintResource<Person> createFintResource(AnsattObject ansattObject, Person person) {
        return FintResource.with(person).addRelasjoner(
                new Relation.Builder()
                        .with(Person.Relasjonsnavn.PERSONALRESSURS)
                        .forType(Personalressurs.class)
                        .field("ansattnummer")
                        .value(ansattObject.getAnsattNummer())
                        .build()
        );
    }
}
