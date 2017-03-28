package no.fint.provider.bluegarden.service.mapper;

import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.provider.bluegarden.service.RelationService;
import no.fint.provider.bluegarden.soap.AnsattObject;
import no.fint.provider.bluegarden.soap.ArbeidsforholdStatusEnumType;
import no.fint.provider.bluegarden.utilities.ArbeidsforholSystemIdUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArbeidsforholdMapperService {

    @Autowired
    private RelationService relationService;

    public List<Arbeidsforhold> arbeidsforholdMapper(List<AnsattObject> ansattObjectList) {

        List<Arbeidsforhold> arbeidsforholdList = new ArrayList<>();

        ansattObjectList.forEach(ansattObject -> {

            ansattObject.getArbeidsforhold().forEach(arbeidsforholdType -> {
                Arbeidsforhold arbeidsforhold = new Arbeidsforhold();

                arbeidsforhold.setAktiv(arbeidsforholdType.getStatus() == ArbeidsforholdStatusEnumType.AKTIV ? true : false);

                arbeidsforhold.setAnsettelsesprosent(100.0);

                arbeidsforhold.setLonnsprosent(100.0);

                arbeidsforhold.setArslonn(450000.0);

                Periode ansettelsesPeriode = new Periode();
                if (arbeidsforholdType.getStartdato() != null) {
                    ansettelsesPeriode.setStart(arbeidsforholdType.getStartdato().toGregorianCalendar().getTime());
                }
                if (arbeidsforholdType.getStoppdato() != null) {
                    ansettelsesPeriode.setSlutt(arbeidsforholdType.getStoppdato().toGregorianCalendar().getTime());
                }
                arbeidsforhold.setGyldighetsperiode(ansettelsesPeriode);

                arbeidsforhold.setStillingsnummer(arbeidsforholdType.getArbeidsforholdnummer());

                arbeidsforhold.setHovedstilling(Boolean.valueOf(arbeidsforholdType.getIsHovedarbeidsforhold()));

                Kontaktinformasjon kontaktInformasjon = new Kontaktinformasjon();
                arbeidsforhold.setKontaktinformasjon(kontaktInformasjon);

                arbeidsforhold.setStillingstittel("Lærer");

                Identifikator systemId = new Identifikator();
                systemId.setIdentifikatorverdi(ArbeidsforholSystemIdUtility.getSystemId(ansattObject.getAnsattNummer(), arbeidsforhold.getStillingsnummer()));
                arbeidsforhold.setSystemId(systemId);

                relationService.addArbeidsforholdPersonalressursRelation(systemId.getIdentifikatorverdi(), ansattObject.getAnsattNummer());

                relationService.addArbeidsforholdOrganisasjonRelation(systemId.getIdentifikatorverdi(), arbeidsforholdType.getOrgUnitId());

                arbeidsforholdList.add(arbeidsforhold);
            });
        });

        return arbeidsforholdList;
    }
}
