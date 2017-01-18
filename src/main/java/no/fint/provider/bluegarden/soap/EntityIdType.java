
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * Representerer en unik id for et domeneobjekt. Tilleggsattributter kan settes for \u00e5 beskrive type id samt "eier" av iden. Datert endring
 * 
 * <p>Java class for EntityIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AlternativeIdValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="validFrom" type="{http://datatypes.bluegarden.no/object/v3}DateTimeType" /&gt;
 *       &lt;attribute name="validTo" type="{http://datatypes.bluegarden.no/object/v3}DateTimeType" /&gt;
 *       &lt;attribute name="idOwner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityIdType", namespace = "http://datatypes.bluegarden.no/object/v3", propOrder = {
    "idValue",
    "alternativeIdValue"
})
public class EntityIdType {

    @XmlElement(name = "IdValue", required = true)
    protected String idValue;
    @XmlElement(name = "AlternativeIdValue")
    protected List<String> alternativeIdValue;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "validFrom")
    protected XMLGregorianCalendar validFrom;
    @XmlAttribute(name = "validTo")
    protected XMLGregorianCalendar validTo;
    @XmlAttribute(name = "idOwner")
    protected String idOwner;

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdValue(String value) {
        this.idValue = value;
    }

    /**
     * Gets the value of the alternativeIdValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeIdValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeIdValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternativeIdValue() {
        if (alternativeIdValue == null) {
            alternativeIdValue = new ArrayList<String>();
        }
        return this.alternativeIdValue;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

    /**
     * Gets the value of the idOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOwner() {
        return idOwner;
    }

    /**
     * Sets the value of the idOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOwner(String value) {
        this.idOwner = value;
    }

}
