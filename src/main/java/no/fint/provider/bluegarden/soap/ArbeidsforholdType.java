
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ArbeidsforholdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArbeidsforholdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arbeidsforholdnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsHovedarbeidsforhold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Startdato" type="{http://datatypes.bluegarden.no/object/v3}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Stoppdato" type="{http://datatypes.bluegarden.no/object/v3}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Stillingskode" type="{http://kodeverk.bluegarden.no/object/v1}StillingKodeverdiType" minOccurs="0"/&gt;
 *         &lt;element name="AnsattforholdsKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Leder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="status" type="{http://ansattlist.bluegarden.no/object/v3_1}ArbeidsforholdStatusEnumType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArbeidsforholdType", namespace = "http://ansattlist.bluegarden.no/object/v3_1", propOrder = {
    "arbeidsforholdnummer",
    "orgUnitName",
    "orgUnitId",
    "isHovedarbeidsforhold",
    "startdato",
    "stoppdato",
    "stillingskode",
    "ansattforholdsKode",
    "leder"
})
public class ArbeidsforholdType {

    @XmlElement(name = "Arbeidsforholdnummer")
    protected String arbeidsforholdnummer;
    @XmlElement(name = "OrgUnitName")
    protected String orgUnitName;
    @XmlElement(name = "OrgUnitId")
    protected String orgUnitId;
    @XmlElement(name = "IsHovedarbeidsforhold")
    protected String isHovedarbeidsforhold;
    @XmlElement(name = "Startdato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdato;
    @XmlElement(name = "Stoppdato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stoppdato;
    @XmlElement(name = "Stillingskode")
    protected StillingKodeverdiType stillingskode;
    @XmlElement(name = "AnsattforholdsKode")
    protected String ansattforholdsKode;
    @XmlElement(name = "Leder")
    protected String leder;
    @XmlAttribute(name = "status")
    protected ArbeidsforholdStatusEnumType status;

    /**
     * Gets the value of the arbeidsforholdnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbeidsforholdnummer() {
        return arbeidsforholdnummer;
    }

    /**
     * Sets the value of the arbeidsforholdnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbeidsforholdnummer(String value) {
        this.arbeidsforholdnummer = value;
    }

    /**
     * Gets the value of the orgUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitName() {
        return orgUnitName;
    }

    /**
     * Sets the value of the orgUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitName(String value) {
        this.orgUnitName = value;
    }

    /**
     * Gets the value of the orgUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitId() {
        return orgUnitId;
    }

    /**
     * Sets the value of the orgUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitId(String value) {
        this.orgUnitId = value;
    }

    /**
     * Gets the value of the isHovedarbeidsforhold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHovedarbeidsforhold() {
        return isHovedarbeidsforhold;
    }

    /**
     * Sets the value of the isHovedarbeidsforhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHovedarbeidsforhold(String value) {
        this.isHovedarbeidsforhold = value;
    }

    /**
     * Gets the value of the startdato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartdato() {
        return startdato;
    }

    /**
     * Sets the value of the startdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartdato(XMLGregorianCalendar value) {
        this.startdato = value;
    }

    /**
     * Gets the value of the stoppdato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStoppdato() {
        return stoppdato;
    }

    /**
     * Sets the value of the stoppdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStoppdato(XMLGregorianCalendar value) {
        this.stoppdato = value;
    }

    /**
     * Gets the value of the stillingskode property.
     * 
     * @return
     *     possible object is
     *     {@link StillingKodeverdiType }
     *     
     */
    public StillingKodeverdiType getStillingskode() {
        return stillingskode;
    }

    /**
     * Sets the value of the stillingskode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StillingKodeverdiType }
     *     
     */
    public void setStillingskode(StillingKodeverdiType value) {
        this.stillingskode = value;
    }

    /**
     * Gets the value of the ansattforholdsKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsattforholdsKode() {
        return ansattforholdsKode;
    }

    /**
     * Sets the value of the ansattforholdsKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsattforholdsKode(String value) {
        this.ansattforholdsKode = value;
    }

    /**
     * Gets the value of the leder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeder() {
        return leder;
    }

    /**
     * Sets the value of the leder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeder(String value) {
        this.leder = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ArbeidsforholdStatusEnumType }
     *     
     */
    public ArbeidsforholdStatusEnumType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArbeidsforholdStatusEnumType }
     *     
     */
    public void setStatus(ArbeidsforholdStatusEnumType value) {
        this.status = value;
    }

}
