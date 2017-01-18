
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TelefonnummerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelefonnummerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Formattertnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;group ref="{http://common.bluegarden.no/object/v1_5}TelefonnummerGroup"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelefonnummerType", propOrder = {
    "formattertnummer",
    "landskode",
    "omradekode",
    "lokaltnummer"
})
@XmlSeeAlso({
    KontaktinformasjonType2 .Mobiltelefon.class
})
public class TelefonnummerType {

    @XmlElement(name = "Formattertnummer")
    protected String formattertnummer;
    @XmlElement(name = "Landskode")
    protected String landskode;
    @XmlElement(name = "Omradekode")
    protected String omradekode;
    @XmlElement(name = "Lokaltnummer")
    protected String lokaltnummer;

    /**
     * Gets the value of the formattertnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattertnummer() {
        return formattertnummer;
    }

    /**
     * Sets the value of the formattertnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattertnummer(String value) {
        this.formattertnummer = value;
    }

    /**
     * Gets the value of the landskode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandskode() {
        return landskode;
    }

    /**
     * Sets the value of the landskode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandskode(String value) {
        this.landskode = value;
    }

    /**
     * Gets the value of the omradekode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmradekode() {
        return omradekode;
    }

    /**
     * Sets the value of the omradekode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmradekode(String value) {
        this.omradekode = value;
    }

    /**
     * Gets the value of the lokaltnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokaltnummer() {
        return lokaltnummer;
    }

    /**
     * Sets the value of the lokaltnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokaltnummer(String value) {
        this.lokaltnummer = value;
    }

}
