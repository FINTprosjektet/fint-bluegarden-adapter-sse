
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for KontaktinformasjonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KontaktinformasjonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adresse" type="{http://common.bluegarden.no/object/v1_5}AdresseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="kontaktinformasjonType" type="{http://ansattlist.bluegarden.no/object/v3_1}KontaktinformasjonEnumType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KontaktinformasjonType", namespace = "http://ansattlist.bluegarden.no/object/v3_1", propOrder = {
    "adresse"
})
public class KontaktinformasjonType {

    @XmlElement(name = "Adresse")
    protected AdresseType adresse;
    @XmlAttribute(name = "kontaktinformasjonType")
    protected KontaktinformasjonEnumType kontaktinformasjonType;

    /**
     * Gets the value of the adresse property.
     * 
     * @return
     *     possible object is
     *     {@link AdresseType }
     *     
     */
    public AdresseType getAdresse() {
        return adresse;
    }

    /**
     * Sets the value of the adresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseType }
     *     
     */
    public void setAdresse(AdresseType value) {
        this.adresse = value;
    }

    /**
     * Gets the value of the kontaktinformasjonType property.
     * 
     * @return
     *     possible object is
     *     {@link KontaktinformasjonEnumType }
     *     
     */
    public KontaktinformasjonEnumType getKontaktinformasjonType() {
        return kontaktinformasjonType;
    }

    /**
     * Sets the value of the kontaktinformasjonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontaktinformasjonEnumType }
     *     
     */
    public void setKontaktinformasjonType(KontaktinformasjonEnumType value) {
        this.kontaktinformasjonType = value;
    }

}
