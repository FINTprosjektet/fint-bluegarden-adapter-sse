package no.fint.provider.bluegarden.service;

import no.fint.provider.bluegarden.soap.AnsattObject;
import no.fk.fint.arbeidstaker.Arbeidstaker;
import no.fk.fint.arbeidstaker.Stilling;
import no.fk.fint.felles.*;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class EmployeeMapperService {

    public List<Arbeidstaker> employeeMapper(List<AnsattObject> ansattObjectList) {
        List<Arbeidstaker> arbeidstakerList = new ArrayList<>();
        ansattObjectList.forEach(ansattObject -> {
            Arbeidstaker arbeidstaker = new Arbeidstaker();
            arbeidstaker.setFulltNavn(String.format("%s %s", ansattObject.getFornavn(), ansattObject.getEtternavn()));
            Personnavn personnavn = new Personnavn();
            personnavn.setFornavn(ansattObject.getFornavn());
            personnavn.setEtternavn(ansattObject.getEtternavn());
            arbeidstaker.setNavn(personnavn);

            Identifikator fodselsnummer = new Identifikator();
            fodselsnummer.setUtstedtAvAutoritet("Folkeregisteret");
            fodselsnummer.setIdentifikatortype("fodselsnummer");
            fodselsnummer.setIdentifikatorverdi(ansattObject.getFodselsnummer());
            arbeidstaker.getIdentifikatorer().add(fodselsnummer);

            Identifikator ansattnummer = new Identifikator();
            ansattnummer.setUtstedtAvAutoritet("BG");
            ansattnummer.setIdentifikatortype("ansattnummer");
            ansattnummer.setIdentifikatorverdi(ansattObject.getAnsattNummer());
            arbeidstaker.getIdentifikatorer().add(ansattnummer);

            Identifikator signatur = new Identifikator();
            signatur.setUtstedtAvAutoritet("HFK");
            signatur.setIdentifikatortype("signatur");
            signatur.setIdentifikatorverdi(ansattObject.getSignatur());
            arbeidstaker.getIdentifikatorer().add(signatur);

            Periode ansattelsesPeriode = new Periode();
            ansattelsesPeriode.setStart(ansattObject.getStartDato());
            ansattelsesPeriode.setSlutt(ansattObject.getSluttDato());
            arbeidstaker.setAnsettelsesperiode(ansattelsesPeriode);

            Kontaktinformasjon kontaktinformasjon = new Kontaktinformasjon();
            kontaktinformasjon.setKontakttype("JOBB");
            kontaktinformasjon.setEpostadresse(String.format("%s@hfk.no", ansattObject.getSignatur()));
            kontaktinformasjon.setMobiltelefonummer(ansattObject.getMobiltelefon());
            kontaktinformasjon.setWebsted("http://www.hfk.no");
            arbeidstaker.getKontaktinformasjoner().add(kontaktinformasjon);

            GregorianCalendar fodselsdato = new GregorianCalendar();
            String nin = ansattObject.getFodselsnummer();
            fodselsdato.set(Integer.parseInt("19" + nin.substring(4, 6)), Integer.parseInt(nin.substring(2, 4)), Integer.parseInt(nin.substring(0, 2)));
            try {
                arbeidstaker.setFoedselsdato(DatatypeFactory.newInstance().newXMLGregorianCalendar(fodselsdato));
            } catch (DatatypeConfigurationException e) {
                e.printStackTrace();
            }
            ansattObject.getKontaktinformasjon().forEach(kontaktinformasjonType -> {
                Adresse adresse = new Adresse();
                adresse.setAdressetype(kontaktinformasjonType.getKontaktinformasjonType().value());
                adresse.setAdresse(kontaktinformasjonType.getAdresse().getAdresseLinje1());
                adresse.setPostnummer(kontaktinformasjonType.getAdresse().getPostnummer());
                adresse.setPoststed(kontaktinformasjonType.getAdresse().getPoststed());
                arbeidstaker.getAdresser().add(adresse);
            });

            ansattObject.getArbeidsforhold().forEach(arbeidsforhold -> {
                Stilling stilling = new Stilling();
                stilling.setAvdeling(arbeidsforhold.getOrgUnitName());
                stilling.setAnsettelsestype(arbeidsforhold.getAnsattforholdsKode());
                stilling.setStillingskode(arbeidsforhold.getStillingskode().getKodeverdi());
                stilling.setOrganisasjon(arbeidsforhold.getOrgUnitId());
                stilling.setStillingsnummer(new BigInteger(arbeidsforhold.getArbeidsforholdnummer()));
                stilling.setStillingsprosent(100.00);
                stilling.setGrunnlonn(500000.00);
                stilling.setStillingstittel(arbeidsforhold.getStillingskode().getBeskrivelse());
                stilling.setStatus(arbeidsforhold.getStatus().name());
                Periode periode = new Periode();
                periode.setStart(arbeidsforhold.getStartdato());
                periode.setSlutt(arbeidsforhold.getStoppdato());
                stilling.setStillingsperiode(periode);

                arbeidstaker.getStillinger().add(stilling);
            });

            arbeidstakerList.add(arbeidstaker);

        });

        return arbeidstakerList;
    }
}
