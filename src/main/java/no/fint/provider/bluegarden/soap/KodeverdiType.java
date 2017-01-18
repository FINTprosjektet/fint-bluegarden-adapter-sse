
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for KodeverdiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KodeverdiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kodeverdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Beskrivelse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KodeverdiType", namespace = "http://kodeverk.bluegarden.no/object/v1", propOrder = {
    "kodeverdi",
    "beskrivelse"
})
@XmlSeeAlso({
    StillingKodeverdiType.class
})
public class KodeverdiType {

    @XmlElement(name = "Kodeverdi", required = true)
    protected String kodeverdi;
    @XmlElement(name = "Beskrivelse")
    protected String beskrivelse;

    /**
     * Gets the value of the kodeverdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeverdi() {
        return kodeverdi;
    }

    /**
     * Sets the value of the kodeverdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeverdi(String value) {
        this.kodeverdi = value;
    }

    /**
     * Gets the value of the beskrivelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrivelse() {
        return beskrivelse;
    }

    /**
     * Sets the value of the beskrivelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrivelse(String value) {
        this.beskrivelse = value;
    }

}
