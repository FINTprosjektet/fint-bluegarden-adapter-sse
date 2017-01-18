
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Inneholder informasjon om en organisasjonsenhet
 * 
 * <p>Java class for OrgUnitObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgUnitObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgNavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Arbeidsgiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Leder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LokasjonBeskrivelse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LokasjonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LokasjonAdresse1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LokasjonAdresse2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LokasjonPostnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LokasjonPoststed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErAktiv" type="{http://datatypes.bluegarden.no/object/v3}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="ErKostnadsforingMulig" type="{http://datatypes.bluegarden.no/object/v3}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="ErPersonallokeringMulig" type="{http://datatypes.bluegarden.no/object/v3}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="OrgnrBedrift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kommunenavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kommunenr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedTime" type="{http://datatypes.bluegarden.no/object/v3}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedTime" type="{http://datatypes.bluegarden.no/object/v3}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgUnitObject", namespace = "http://bluegarden.no/organisation/structure/object/v31", propOrder = {
    "orgNavn",
    "groupId",
    "parentGroupId",
    "orgId",
    "arbeidsgiver",
    "leder",
    "lokasjonBeskrivelse",
    "lokasjonId",
    "lokasjonAdresse1",
    "lokasjonAdresse2",
    "lokasjonPostnr",
    "lokasjonPoststed",
    "erAktiv",
    "erKostnadsforingMulig",
    "erPersonallokeringMulig",
    "orgnrBedrift",
    "kommunenavn",
    "kommunenr",
    "createdTime",
    "updatedTime"
})
public class OrgUnitObject {

    @XmlElement(name = "OrgNavn")
    protected String orgNavn;
    @XmlElement(name = "GroupId")
    protected String groupId;
    @XmlElement(name = "ParentGroupId")
    protected String parentGroupId;
    @XmlElement(name = "OrgId")
    protected String orgId;
    @XmlElement(name = "Arbeidsgiver")
    protected String arbeidsgiver;
    @XmlElement(name = "Leder")
    protected String leder;
    @XmlElement(name = "LokasjonBeskrivelse")
    protected String lokasjonBeskrivelse;
    @XmlElement(name = "LokasjonId")
    protected String lokasjonId;
    @XmlElement(name = "LokasjonAdresse1")
    protected String lokasjonAdresse1;
    @XmlElement(name = "LokasjonAdresse2")
    protected String lokasjonAdresse2;
    @XmlElement(name = "LokasjonPostnr")
    protected String lokasjonPostnr;
    @XmlElement(name = "LokasjonPoststed")
    protected String lokasjonPoststed;
    @XmlElement(name = "ErAktiv")
    protected Boolean erAktiv;
    @XmlElement(name = "ErKostnadsforingMulig")
    protected Boolean erKostnadsforingMulig;
    @XmlElement(name = "ErPersonallokeringMulig")
    protected Boolean erPersonallokeringMulig;
    @XmlElement(name = "OrgnrBedrift")
    protected String orgnrBedrift;
    @XmlElement(name = "Kommunenavn")
    protected String kommunenavn;
    @XmlElement(name = "Kommunenr")
    protected String kommunenr;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "UpdatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;

    /**
     * Gets the value of the orgNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNavn() {
        return orgNavn;
    }

    /**
     * Sets the value of the orgNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNavn(String value) {
        this.orgNavn = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the parentGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGroupId() {
        return parentGroupId;
    }

    /**
     * Sets the value of the parentGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGroupId(String value) {
        this.parentGroupId = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
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
     * Gets the value of the lokasjonBeskrivelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokasjonBeskrivelse() {
        return lokasjonBeskrivelse;
    }

    /**
     * Sets the value of the lokasjonBeskrivelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokasjonBeskrivelse(String value) {
        this.lokasjonBeskrivelse = value;
    }

    /**
     * Gets the value of the lokasjonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokasjonId() {
        return lokasjonId;
    }

    /**
     * Sets the value of the lokasjonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokasjonId(String value) {
        this.lokasjonId = value;
    }

    /**
     * Gets the value of the lokasjonAdresse1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokasjonAdresse1() {
        return lokasjonAdresse1;
    }

    /**
     * Sets the value of the lokasjonAdresse1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokasjonAdresse1(String value) {
        this.lokasjonAdresse1 = value;
    }

    /**
     * Gets the value of the lokasjonAdresse2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokasjonAdresse2() {
        return lokasjonAdresse2;
    }

    /**
     * Sets the value of the lokasjonAdresse2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokasjonAdresse2(String value) {
        this.lokasjonAdresse2 = value;
    }

    /**
     * Gets the value of the lokasjonPostnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokasjonPostnr() {
        return lokasjonPostnr;
    }

    /**
     * Sets the value of the lokasjonPostnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokasjonPostnr(String value) {
        this.lokasjonPostnr = value;
    }

    /**
     * Gets the value of the lokasjonPoststed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokasjonPoststed() {
        return lokasjonPoststed;
    }

    /**
     * Sets the value of the lokasjonPoststed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokasjonPoststed(String value) {
        this.lokasjonPoststed = value;
    }

    /**
     * Gets the value of the erAktiv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErAktiv() {
        return erAktiv;
    }

    /**
     * Sets the value of the erAktiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErAktiv(Boolean value) {
        this.erAktiv = value;
    }

    /**
     * Gets the value of the erKostnadsforingMulig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErKostnadsforingMulig() {
        return erKostnadsforingMulig;
    }

    /**
     * Sets the value of the erKostnadsforingMulig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErKostnadsforingMulig(Boolean value) {
        this.erKostnadsforingMulig = value;
    }

    /**
     * Gets the value of the erPersonallokeringMulig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErPersonallokeringMulig() {
        return erPersonallokeringMulig;
    }

    /**
     * Sets the value of the erPersonallokeringMulig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErPersonallokeringMulig(Boolean value) {
        this.erPersonallokeringMulig = value;
    }

    /**
     * Gets the value of the orgnrBedrift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnrBedrift() {
        return orgnrBedrift;
    }

    /**
     * Sets the value of the orgnrBedrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnrBedrift(String value) {
        this.orgnrBedrift = value;
    }

    /**
     * Gets the value of the kommunenavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunenavn() {
        return kommunenavn;
    }

    /**
     * Sets the value of the kommunenavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunenavn(String value) {
        this.kommunenavn = value;
    }

    /**
     * Gets the value of the kommunenr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommunenr() {
        return kommunenr;
    }

    /**
     * Sets the value of the kommunenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommunenr(String value) {
        this.kommunenr = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Gets the value of the updatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Sets the value of the updatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

}
