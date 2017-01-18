
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * representation Ansatt for SNN
 * 
 * <p>Java class for AnsattObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnsattObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDato" type="{http://datatypes.bluegarden.no/object/v3}DateType" minOccurs="0"/&gt;
 *         &lt;element name="SluttDato" type="{http://datatypes.bluegarden.no/object/v3}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Signatur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fornavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Etternavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobiltelefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnsattNummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fodselsnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Arbeidsgiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArbeidsgiverNummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Kontaktinformasjon" type="{http://ansattlist.bluegarden.no/object/v3_1}KontaktinformasjonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Arbeidsforhold" type="{http://ansattlist.bluegarden.no/object/v3_1}ArbeidsforholdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnsattObject", namespace = "http://ansattlist.bluegarden.no/object/v3_1", propOrder = {
    "personID",
    "startDato",
    "sluttDato",
    "signatur",
    "fornavn",
    "etternavn",
    "mobiltelefon",
    "ansattNummer",
    "fodselsnummer",
    "arbeidsgiver",
    "arbeidsgiverNummer",
    "kontaktinformasjon",
    "arbeidsforhold"
})
public class AnsattObject {

    @XmlElement(name = "PersonID")
    protected String personID;
    @XmlElement(name = "StartDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDato;
    @XmlElement(name = "SluttDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sluttDato;
    @XmlElement(name = "Signatur")
    protected String signatur;
    @XmlElement(name = "Fornavn")
    protected String fornavn;
    @XmlElement(name = "Etternavn")
    protected String etternavn;
    @XmlElement(name = "Mobiltelefon")
    protected String mobiltelefon;
    @XmlElement(name = "AnsattNummer", required = true)
    protected String ansattNummer;
    @XmlElement(name = "Fodselsnummer")
    protected String fodselsnummer;
    @XmlElement(name = "Arbeidsgiver")
    protected String arbeidsgiver;
    @XmlElement(name = "ArbeidsgiverNummer", required = true)
    protected String arbeidsgiverNummer;
    @XmlElement(name = "Kontaktinformasjon")
    protected List<KontaktinformasjonType> kontaktinformasjon;
    @XmlElement(name = "Arbeidsforhold")
    protected List<ArbeidsforholdType> arbeidsforhold;

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonID(String value) {
        this.personID = value;
    }

    /**
     * Gets the value of the startDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDato() {
        return startDato;
    }

    /**
     * Sets the value of the startDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDato(XMLGregorianCalendar value) {
        this.startDato = value;
    }

    /**
     * Gets the value of the sluttDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSluttDato() {
        return sluttDato;
    }

    /**
     * Sets the value of the sluttDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSluttDato(XMLGregorianCalendar value) {
        this.sluttDato = value;
    }

    /**
     * Gets the value of the signatur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatur() {
        return signatur;
    }

    /**
     * Sets the value of the signatur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatur(String value) {
        this.signatur = value;
    }

    /**
     * Gets the value of the fornavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFornavn() {
        return fornavn;
    }

    /**
     * Sets the value of the fornavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornavn(String value) {
        this.fornavn = value;
    }

    /**
     * Gets the value of the etternavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtternavn() {
        return etternavn;
    }

    /**
     * Sets the value of the etternavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtternavn(String value) {
        this.etternavn = value;
    }

    /**
     * Gets the value of the mobiltelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobiltelefon() {
        return mobiltelefon;
    }

    /**
     * Sets the value of the mobiltelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobiltelefon(String value) {
        this.mobiltelefon = value;
    }

    /**
     * Gets the value of the ansattNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsattNummer() {
        return ansattNummer;
    }

    /**
     * Sets the value of the ansattNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsattNummer(String value) {
        this.ansattNummer = value;
    }

    /**
     * Gets the value of the fodselsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFodselsnummer() {
        return fodselsnummer;
    }

    /**
     * Sets the value of the fodselsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFodselsnummer(String value) {
        this.fodselsnummer = value;
    }

    /**
     * Gets the value of the arbeidsgiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbeidsgiver() {
        return arbeidsgiver;
    }

    /**
     * Sets the value of the arbeidsgiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbeidsgiver(String value) {
        this.arbeidsgiver = value;
    }

    /**
     * Gets the value of the arbeidsgiverNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbeidsgiverNummer() {
        return arbeidsgiverNummer;
    }

    /**
     * Sets the value of the arbeidsgiverNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbeidsgiverNummer(String value) {
        this.arbeidsgiverNummer = value;
    }

    /**
     * Gets the value of the kontaktinformasjon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kontaktinformasjon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKontaktinformasjon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KontaktinformasjonType }
     * 
     * 
     */
    public List<KontaktinformasjonType> getKontaktinformasjon() {
        if (kontaktinformasjon == null) {
            kontaktinformasjon = new ArrayList<KontaktinformasjonType>();
        }
        return this.kontaktinformasjon;
    }

    /**
     * Gets the value of the arbeidsforhold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arbeidsforhold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArbeidsforhold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArbeidsforholdType }
     * 
     * 
     */
    public List<ArbeidsforholdType> getArbeidsforhold() {
        if (arbeidsforhold == null) {
            arbeidsforhold = new ArrayList<ArbeidsforholdType>();
        }
        return this.arbeidsforhold;
    }

}
