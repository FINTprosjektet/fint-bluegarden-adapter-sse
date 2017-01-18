
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
 *         &lt;element name="E-post" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Privattelefon" type="{http://common.bluegarden.no/object/v1_5}TelefonnummerType" minOccurs="0"/&gt;
 *         &lt;element name="Jobbtelefon" type="{http://common.bluegarden.no/object/v1_5}TelefonnummerType" minOccurs="0"/&gt;
 *         &lt;element name="Mobiltelefon" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://common.bluegarden.no/object/v1_5}TelefonnummerType"&gt;
 *                 &lt;attribute name="private" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Faksnummer" type="{http://common.bluegarden.no/object/v1_5}TelefonnummerType" minOccurs="0"/&gt;
 *         &lt;element name="Internettadresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="kontaktinformasjonType" type="{http://common.bluegarden.no/object/v1_5}KontaktinformasjonEnumType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KontaktinformasjonType", propOrder = {
    "adresse",
    "ePost",
    "privattelefon",
    "jobbtelefon",
    "mobiltelefon",
    "faksnummer",
    "internettadresse"
})
public class KontaktinformasjonType2 {

    @XmlElement(name = "Adresse")
    protected AdresseType adresse;
    @XmlElement(name = "E-post")
    protected String ePost;
    @XmlElement(name = "Privattelefon")
    protected TelefonnummerType privattelefon;
    @XmlElement(name = "Jobbtelefon")
    protected TelefonnummerType jobbtelefon;
    @XmlElement(name = "Mobiltelefon")
    protected KontaktinformasjonType2 .Mobiltelefon mobiltelefon;
    @XmlElement(name = "Faksnummer")
    protected TelefonnummerType faksnummer;
    @XmlElement(name = "Internettadresse")
    protected String internettadresse;
    @XmlAttribute(name = "kontaktinformasjonType")
    protected KontaktinformasjonEnumType2 kontaktinformasjonType;

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
     * Gets the value of the ePost property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEPost() {
        return ePost;
    }

    /**
     * Sets the value of the ePost property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEPost(String value) {
        this.ePost = value;
    }

    /**
     * Gets the value of the privattelefon property.
     *
     * @return
     *     possible object is
     *     {@link TelefonnummerType }
     *
     */
    public TelefonnummerType getPrivattelefon() {
        return privattelefon;
    }

    /**
     * Sets the value of the privattelefon property.
     *
     * @param value
     *     allowed object is
     *     {@link TelefonnummerType }
     *
     */
    public void setPrivattelefon(TelefonnummerType value) {
        this.privattelefon = value;
    }

    /**
     * Gets the value of the jobbtelefon property.
     *
     * @return
     *     possible object is
     *     {@link TelefonnummerType }
     *
     */
    public TelefonnummerType getJobbtelefon() {
        return jobbtelefon;
    }

    /**
     * Sets the value of the jobbtelefon property.
     *
     * @param value
     *     allowed object is
     *     {@link TelefonnummerType }
     *
     */
    public void setJobbtelefon(TelefonnummerType value) {
        this.jobbtelefon = value;
    }

    /**
     * Gets the value of the mobiltelefon property.
     *
     * @return
     *     possible object is
     *     {@link KontaktinformasjonType2 .Mobiltelefon }
     *
     */
    public KontaktinformasjonType2 .Mobiltelefon getMobiltelefon() {
        return mobiltelefon;
    }

    /**
     * Sets the value of the mobiltelefon property.
     *
     * @param value
     *     allowed object is
     *     {@link KontaktinformasjonType2 .Mobiltelefon }
     *
     */
    public void setMobiltelefon(KontaktinformasjonType2 .Mobiltelefon value) {
        this.mobiltelefon = value;
    }

    /**
     * Gets the value of the faksnummer property.
     * 
     * @return
     *     possible object is
     *     {@link TelefonnummerType }
     *     
     */
    public TelefonnummerType getFaksnummer() {
        return faksnummer;
    }

    /**
     * Sets the value of the faksnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelefonnummerType }
     *     
     */
    public void setFaksnummer(TelefonnummerType value) {
        this.faksnummer = value;
    }

    /**
     * Gets the value of the internettadresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternettadresse() {
        return internettadresse;
    }

    /**
     * Sets the value of the internettadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternettadresse(String value) {
        this.internettadresse = value;
    }

    /**
     * Gets the value of the kontaktinformasjonType property.
     * 
     * @return
     *     possible object is
     *     {@link KontaktinformasjonEnumType2 }
     *     
     */
    public KontaktinformasjonEnumType2 getKontaktinformasjonType() {
        return kontaktinformasjonType;
    }

    /**
     * Sets the value of the kontaktinformasjonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontaktinformasjonEnumType2 }
     *     
     */
    public void setKontaktinformasjonType(KontaktinformasjonEnumType2 value) {
        this.kontaktinformasjonType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://common.bluegarden.no/object/v1_5}TelefonnummerType"&gt;
     *       &lt;attribute name="private" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Mobiltelefon
        extends TelefonnummerType
    {

        @XmlAttribute(name = "private")
        protected Boolean _private;

        /**
         * Gets the value of the private property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrivate() {
            return _private;
        }

        /**
         * Sets the value of the private property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrivate(Boolean value) {
            this._private = value;
        }

    }

}
