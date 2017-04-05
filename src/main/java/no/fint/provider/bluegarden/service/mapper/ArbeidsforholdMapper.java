package no.fint.provider.bluegarden.service.mapper;

import no.fint.model.administrasjon.organisasjon.Organisasjonselement;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Identifikator;
import no.fint.model.felles.Kontaktinformasjon;
import no.fint.model.felles.Periode;
import no.fint.model.relation.FintResource;
import no.fint.model.relation.Relation;
import no.fint.provider.bluegarden.soap.AnsattObject;
import no.fint.provider.bluegarden.soap.ArbeidsforholdStatusEnumType;
import no.fint.provider.bluegarden.soap.ArbeidsforholdType;
import no.fint.provider.bluegarden.utilities.ArbeidsforholdSystemIdUtility;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArbeidsforholdMapper {

    public List<FintResource<Arbeidsforhold>> convertToResource(List<AnsattObject> ansattObjectList) {
        List<FintResource<Arbeidsforhold>> arbeidsforholdList = new ArrayList<>();

        ansattObjectList.forEach(ansattObject -> {
            ansattObject.getArbeidsforhold().forEach(arbeidsforholdType -> {
                Arbeidsforhold arbeidsforhold = new Arbeidsforhold();
                arbeidsforhold.setAktiv(arbeidsforholdType.getStatus() == ArbeidsforholdStatusEnumType.AKTIV);
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
                systemId.setIdentifikatorverdi(ArbeidsforholdSystemIdUtility.getSystemId(ansattObject.getAnsattNummer(), arbeidsforhold.getStillingsnummer()));
                arbeidsforhold.setSystemId(systemId);

                FintResource<Arbeidsforhold> fintResource = createFintResource(ansattObject, arbeidsforholdType, arbeidsforhold);
                arbeidsforholdList.add(fintResource);
            });
        });

        return arbeidsforholdList;
    }

    private FintResource<Arbeidsforhold> createFintResource(AnsattObject ansattObject, ArbeidsforholdType arbeidsforholdType, Arbeidsforhold arbeidsforhold) {
        return FintResource.with(arbeidsforhold)
                .addRelasjon(
                        new Relation.Builder()
                                .with(Arbeidsforhold.Relasjonsnavn.PERSONALRESSURS)
                                .forType(Personalressurs.class)
                                .path("/administrasjon/personal/personalressurs")
                                .field("ansattnummer")
                                .value(ansattObject.getAnsattNummer())
                                .build()
                )
                .addRelasjon(
                        new Relation.Builder()
                                .with(Arbeidsforhold.Relasjonsnavn.ORGANISASJON)
                                .forType(Organisasjonselement.class)
                                .path("/administrasjon/organisasjon/organisasjonselement")
                                .field("organisasjonskode")
                                .value(arbeidsforholdType.getOrgUnitId())
                                .build()
                );
    }
}
