
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * Beskriver en person
 * 
 * <p>Java class for PersonObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonID" type="{http://datatypes.bluegarden.no/object/v3}EntityIdType"/&gt;
 *         &lt;element name="Personnavn" type="{http://common.bluegarden.no/object/v1_5}PersonNavnType" minOccurs="0"/&gt;
 *         &lt;element name="Kjonn" type="{http://datatypes.bluegarden.no/object/v3}KjonnCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Fodselsdato" type="{http://datatypes.bluegarden.no/object/v3}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Fodselsnummer" type="{http://datatypes.bluegarden.no/object/v3}EntityIdType" minOccurs="0"/&gt;
 *         &lt;element name="Sivilstatus" type="{http://datatypes.bluegarden.no/object/v3}SivilstatusEnumType" minOccurs="0"/&gt;
 *         &lt;element name="AntallBarn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Dodsdato" type="{http://datatypes.bluegarden.no/object/v3}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Statsborgerskap" type="{http://datatypes.bluegarden.no/object/v3}LandCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Kontaktinformasjon" type="{http://common.bluegarden.no/object/v1_5}KontaktinformasjonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Parorende" type="{http://common.bluegarden.no/object/v1_5}FamiliemedlemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UserArea" type="{http://datatypes.bluegarden.no/object/v3}UserAreaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonObject", propOrder = {
    "personID",
    "personnavn",
    "kjonn",
    "fodselsdato",
    "fodselsnummer",
    "sivilstatus",
    "antallBarn",
    "dodsdato",
    "statsborgerskap",
    "kontaktinformasjon",
    "parorende",
    "userArea"
})
public class PersonObject {

    @XmlElement(name = "PersonID", required = true)
    protected EntityIdType personID;
    @XmlElement(name = "Personnavn")
    protected PersonNavnType personnavn;
    @XmlElement(name = "Kjonn")
    protected BigInteger kjonn;
    @XmlElement(name = "Fodselsdato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fodselsdato;
    @XmlElement(name = "Fodselsnummer")
    protected EntityIdType fodselsnummer;
    @XmlElement(name = "Sivilstatus")
    @XmlSchemaType(name = "normalizedString")
    protected SivilstatusEnumType sivilstatus;
    @XmlElement(name = "AntallBarn")
    protected BigInteger antallBarn;
    @XmlElement(name = "Dodsdato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dodsdato;
    @XmlElement(name = "Statsborgerskap")
    protected String statsborgerskap;
    @XmlElement(name = "Kontaktinformasjon")
    protected List<KontaktinformasjonType2> kontaktinformasjon;
    @XmlElement(name = "Parorende")
    protected List<FamiliemedlemType> parorende;
    @XmlElement(name = "UserArea")
    protected List<UserAreaType> userArea;

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *     
     */
    public EntityIdType getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *     
     */
    public void setPersonID(EntityIdType value) {
        this.personID = value;
    }

    /**
     * Gets the value of the personnavn property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNavnType }
     *     
     */
    public PersonNavnType getPersonnavn() {
        return personnavn;
    }

    /**
     * Sets the value of the personnavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNavnType }
     *     
     */
    public void setPersonnavn(PersonNavnType value) {
        this.personnavn = value;
    }

    /**
     * Gets the value of the kjonn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKjonn() {
        return kjonn;
    }

    /**
     * Sets the value of the kjonn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKjonn(BigInteger value) {
        this.kjonn = value;
    }

    /**
     * Gets the value of the fodselsdato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFodselsdato() {
        return fodselsdato;
    }

    /**
     * Sets the value of the fodselsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFodselsdato(XMLGregorianCalendar value) {
        this.fodselsdato = value;
    }

    /**
     * Gets the value of the fodselsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *     
     */
    public EntityIdType getFodselsnummer() {
        return fodselsnummer;
    }

    /**
     * Sets the value of the fodselsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *     
     */
    public void setFodselsnummer(EntityIdType value) {
        this.fodselsnummer = value;
    }

    /**
     * Gets the value of the sivilstatus property.
     * 
     * @return
     *     possible object is
     *     {@link SivilstatusEnumType }
     *     
     */
    public SivilstatusEnumType getSivilstatus() {
        return sivilstatus;
    }

    /**
     * Sets the value of the sivilstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SivilstatusEnumType }
     *     
     */
    public void setSivilstatus(SivilstatusEnumType value) {
        this.sivilstatus = value;
    }

    /**
     * Gets the value of the antallBarn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAntallBarn() {
        return antallBarn;
    }

    /**
     * Sets the value of the antallBarn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAntallBarn(BigInteger value) {
        this.antallBarn = value;
    }

    /**
     * Gets the value of the dodsdato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDodsdato() {
        return dodsdato;
    }

    /**
     * Sets the value of the dodsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDodsdato(XMLGregorianCalendar value) {
        this.dodsdato = value;
    }

    /**
     * Gets the value of the statsborgerskap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatsborgerskap() {
        return statsborgerskap;
    }

    /**
     * Sets the value of the statsborgerskap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatsborgerskap(String value) {
        this.statsborgerskap = value;
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
     * {@link KontaktinformasjonType2 }
     * 
     * 
     */
    public List<KontaktinformasjonType2> getKontaktinformasjon() {
        if (kontaktinformasjon == null) {
            kontaktinformasjon = new ArrayList<KontaktinformasjonType2>();
        }
        return this.kontaktinformasjon;
    }

    /**
     * Gets the value of the parorende property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parorende property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParorende().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamiliemedlemType }
     * 
     * 
     */
    public List<FamiliemedlemType> getParorende() {
        if (parorende == null) {
            parorende = new ArrayList<FamiliemedlemType>();
        }
        return this.parorende;
    }

    /**
     * Gets the value of the userArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAreaType }
     * 
     * 
     */
    public List<UserAreaType> getUserArea() {
        if (userArea == null) {
            userArea = new ArrayList<UserAreaType>();
        }
        return this.userArea;
    }

}
