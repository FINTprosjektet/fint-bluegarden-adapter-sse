
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * En samling av begreper eller en klassifikasjon hvor hver tilh\u00f8rende begrepsdefinisjon er tilknyttet en unik kode innenfor samlingen eller klassifikasjonen.
 * 
 * <p>Java class for KodeverkObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KodeverkObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://datatypes.bluegarden.no/object/v3}EntityIdType" minOccurs="0"/&gt;
 *         &lt;element name="parentID" type="{http://datatypes.bluegarden.no/object/v3}EntityIdType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Beskrivelse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Utsteder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kodeverdier" type="{http://kodeverk.bluegarden.no/object/v1}KodeverdiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="validFrom" type="{http://datatypes.bluegarden.no/object/v3}DateTimeType" /&gt;
 *       &lt;attribute name="validTo" type="{http://datatypes.bluegarden.no/object/v3}DateTimeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KodeverkObject", namespace = "http://kodeverk.bluegarden.no/object/v1", propOrder = {
    "id",
    "parentID",
    "type",
    "beskrivelse",
    "utsteder",
    "status",
    "kodeverdier"
})
public class KodeverkObject {

    @XmlElement(name = "ID")
    protected EntityIdType id;
    protected EntityIdType parentID;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Beskrivelse")
    protected String beskrivelse;
    @XmlElement(name = "Utsteder")
    protected String utsteder;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Kodeverdier")
    protected List<KodeverdiType> kodeverdier;
    @XmlAttribute(name = "validFrom")
    protected XMLGregorianCalendar validFrom;
    @XmlAttribute(name = "validTo")
    protected XMLGregorianCalendar validTo;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *     
     */
    public EntityIdType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *     
     */
    public void setID(EntityIdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *     
     */
    public EntityIdType getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *     
     */
    public void setParentID(EntityIdType value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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

    /**
     * Gets the value of the utsteder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtsteder() {
        return utsteder;
    }

    /**
     * Sets the value of the utsteder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtsteder(String value) {
        this.utsteder = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the kodeverdier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kodeverdier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKodeverdier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KodeverdiType }
     * 
     * 
     */
    public List<KodeverdiType> getKodeverdier() {
        if (kodeverdier == null) {
            kodeverdier = new ArrayList<KodeverdiType>();
        }
        return this.kodeverdier;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

}
