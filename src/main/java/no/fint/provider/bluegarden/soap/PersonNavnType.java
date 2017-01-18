
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Representerer en persons navn
 * 
 * <p>Java class for PersonNavnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNavnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fulltnavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fornavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mellomnavn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Etternavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tittel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNavnType", propOrder = {
    "fulltnavn",
    "fornavn",
    "mellomnavn",
    "etternavn",
    "tittel"
})
@XmlSeeAlso({
    FamiliemedlemType.class
})
public class PersonNavnType {

    @XmlElement(name = "Fulltnavn")
    protected String fulltnavn;
    @XmlElement(name = "Fornavn")
    protected String fornavn;
    @XmlElement(name = "Mellomnavn")
    protected List<String> mellomnavn;
    @XmlElement(name = "Etternavn")
    protected String etternavn;
    @XmlElement(name = "Tittel")
    protected String tittel;

    /**
     * Gets the value of the fulltnavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulltnavn() {
        return fulltnavn;
    }

    /**
     * Sets the value of the fulltnavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulltnavn(String value) {
        this.fulltnavn = value;
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
     * Gets the value of the mellomnavn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mellomnavn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMellomnavn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMellomnavn() {
        if (mellomnavn == null) {
            mellomnavn = new ArrayList<String>();
        }
        return this.mellomnavn;
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
     * Gets the value of the tittel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTittel() {
        return tittel;
    }

    /**
     * Sets the value of the tittel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTittel(String value) {
        this.tittel = value;
    }

}
