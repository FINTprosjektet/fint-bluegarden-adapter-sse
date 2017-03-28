package no.fint.provider.bluegarden.service.mapper;

import no.fint.model.felles.*;
import no.fint.provider.bluegarden.service.RelationService;
import no.fint.provider.bluegarden.soap.AnsattObject;
import no.fint.provider.bluegarden.soap.KontaktinformasjonEnumType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PersonMapperService {

    @Autowired
    private RelationService relationService;

    public List<Person> personMapper(List<AnsattObject> ansattObjectList) {

        List<Person> personList = new ArrayList<>();

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
                    relationService.addAdresseCountryRelation(kontaktinformasjonType.getAdresse().getLand());
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

            relationService.addPersonGenderRelation(ansattObject.getFodselsnummer(), getGender(ansattObject.getFodselsnummer()));

            Personnavn navn = new Personnavn();
            navn.setFornavn(ansattObject.getFornavn());
            navn.setEtternavn(ansattObject.getEtternavn());
            person.setNavn(navn);

            relationService.addPersonPersonalressursRelation(ansattObject.getFodselsnummer(), ansattObject.getAnsattNummer());

            personList.add(person);

        });

        return personList;
    }

    private String getGender(String fodselsnummer) {
        if (Integer.valueOf(fodselsnummer.substring(10)) % 2 == 0) {
            return "2";
        }
        else {
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
