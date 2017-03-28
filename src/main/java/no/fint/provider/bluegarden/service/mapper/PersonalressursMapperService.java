package no.fint.provider.bluegarden.service.mapper;

import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.provider.bluegarden.service.RelationService;
import no.fint.provider.bluegarden.soap.AnsattObject;
import no.fint.provider.bluegarden.utilities.ArbeidsforholSystemIdUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PersonalressursMapperService {

    @Autowired
    private RelationService relationService;

    public List<Personalressurs> personalressursMapper(List<AnsattObject> ansattObjectList) {

        List<Personalressurs> personalressursList = new ArrayList<>();

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

            relationService.addPersonalressursPersonRelation(ansattObject.getFodselsnummer(), ansattObject.getAnsattNummer());
            relationService.addPersonalressurskategoriPersonalressurskategoriRelation(ansattObject.getAnsattNummer(), "F");
            ansattObject.getArbeidsforhold().forEach(arbeidsforholdType -> {
                relationService.addPersonalressursArbeidsforholdRelation(ansattObject.getAnsattNummer(),
                        ArbeidsforholSystemIdUtility.getSystemId(
                                ansattObject.getAnsattNummer(),
                                arbeidsforholdType.getArbeidsforholdnummer()
                        )
                );
            });

            personalressursList.add(personalressurs);
        });

        return personalressursList;
    }
}
