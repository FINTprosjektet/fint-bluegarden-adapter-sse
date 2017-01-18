
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Familiemedlem i relasjon til Person. Hva med spr\u00e5k (muntelig)
 * 
 * <p>Java class for FamiliemedlemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamiliemedlemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.bluegarden.no/object/v1_5}PersonNavnType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kontaktinformasjon" type="{http://common.bluegarden.no/object/v1_5}KontaktinformasjonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="erPrimarKontakt" type="{http://datatypes.bluegarden.no/object/v3}IndicatorType" /&gt;
 *       &lt;attribute name="slektskap" type="{http://datatypes.bluegarden.no/object/v3}SlektskapsEnumType" /&gt;
 *       &lt;attribute name="forsorger" type="{http://datatypes.bluegarden.no/object/v3}ForsorgerEnumType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamiliemedlemType", propOrder = {
    "kontaktinformasjon"
})
public class FamiliemedlemType
    extends PersonNavnType
{

    @XmlElement(name = "Kontaktinformasjon")
    protected List<KontaktinformasjonType2> kontaktinformasjon;
    @XmlAttribute(name = "erPrimarKontakt")
    protected Boolean erPrimarKontakt;
    @XmlAttribute(name = "slektskap")
    protected SlektskapsEnumType slektskap;
    @XmlAttribute(name = "forsorger")
    protected ForsorgerEnumType forsorger;

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
     * Gets the value of the erPrimarKontakt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErPrimarKontakt() {
        return erPrimarKontakt;
    }

    /**
     * Sets the value of the erPrimarKontakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErPrimarKontakt(Boolean value) {
        this.erPrimarKontakt = value;
    }

    /**
     * Gets the value of the slektskap property.
     * 
     * @return
     *     possible object is
     *     {@link SlektskapsEnumType }
     *     
     */
    public SlektskapsEnumType getSlektskap() {
        return slektskap;
    }

    /**
     * Sets the value of the slektskap property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlektskapsEnumType }
     *     
     */
    public void setSlektskap(SlektskapsEnumType value) {
        this.slektskap = value;
    }

    /**
     * Gets the value of the forsorger property.
     * 
     * @return
     *     possible object is
     *     {@link ForsorgerEnumType }
     *     
     */
    public ForsorgerEnumType getForsorger() {
        return forsorger;
    }

    /**
     * Sets the value of the forsorger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForsorgerEnumType }
     *     
     */
    public void setForsorger(ForsorgerEnumType value) {
        this.forsorger = value;
    }

}
