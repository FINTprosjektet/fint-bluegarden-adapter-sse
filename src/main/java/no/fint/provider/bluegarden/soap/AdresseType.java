
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Beskriver en adresse
 * 
 * <p>Java class for AdresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdresseLinje1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdresseLinje2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdresseLinje3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdresseLinje4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COAdresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Postnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Poststed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Land" type="{http://datatypes.bluegarden.no/object/v3}LandCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresseType", propOrder = {
    "adresseLinje1",
    "adresseLinje2",
    "adresseLinje3",
    "adresseLinje4",
    "coAdresse",
    "postnummer",
    "poststed",
    "land"
})
public class AdresseType {

    @XmlElement(name = "AdresseLinje1")
    protected String adresseLinje1;
    @XmlElement(name = "AdresseLinje2")
    protected String adresseLinje2;
    @XmlElement(name = "AdresseLinje3")
    protected String adresseLinje3;
    @XmlElement(name = "AdresseLinje4")
    protected String adresseLinje4;
    @XmlElement(name = "COAdresse")
    protected String coAdresse;
    @XmlElement(name = "Postnummer")
    protected String postnummer;
    @XmlElement(name = "Poststed")
    protected String poststed;
    @XmlElement(name = "Land")
    protected String land;

    /**
     * Gets the value of the adresseLinje1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseLinje1() {
        return adresseLinje1;
    }

    /**
     * Sets the value of the adresseLinje1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseLinje1(String value) {
        this.adresseLinje1 = value;
    }

    /**
     * Gets the value of the adresseLinje2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseLinje2() {
        return adresseLinje2;
    }

    /**
     * Sets the value of the adresseLinje2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseLinje2(String value) {
        this.adresseLinje2 = value;
    }

    /**
     * Gets the value of the adresseLinje3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseLinje3() {
        return adresseLinje3;
    }

    /**
     * Sets the value of the adresseLinje3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseLinje3(String value) {
        this.adresseLinje3 = value;
    }

    /**
     * Gets the value of the adresseLinje4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseLinje4() {
        return adresseLinje4;
    }

    /**
     * Sets the value of the adresseLinje4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseLinje4(String value) {
        this.adresseLinje4 = value;
    }

    /**
     * Gets the value of the coAdresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOAdresse() {
        return coAdresse;
    }

    /**
     * Sets the value of the coAdresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOAdresse(String value) {
        this.coAdresse = value;
    }

    /**
     * Gets the value of the postnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostnummer() {
        return postnummer;
    }

    /**
     * Sets the value of the postnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostnummer(String value) {
        this.postnummer = value;
    }

    /**
     * Gets the value of the poststed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoststed() {
        return poststed;
    }

    /**
     * Sets the value of the poststed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoststed(String value) {
        this.poststed = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand(String value) {
        this.land = value;
    }

}
