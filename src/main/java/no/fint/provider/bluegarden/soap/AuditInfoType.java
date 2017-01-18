
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AuditInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OpprettetDato" type="{http://datatypes.bluegarden.no/object/v3}DateType"/&gt;
 *         &lt;element name="OpprettetAv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EndretDato" type="{http://datatypes.bluegarden.no/object/v3}DateType"/&gt;
 *         &lt;element name="EndretAv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditInfoType", propOrder = {
    "opprettetDato",
    "opprettetAv",
    "endretDato",
    "endretAv"
})
public class AuditInfoType {

    @XmlElement(name = "OpprettetDato", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar opprettetDato;
    @XmlElement(name = "OpprettetAv", required = true)
    protected String opprettetAv;
    @XmlElement(name = "EndretDato", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endretDato;
    @XmlElement(name = "EndretAv", required = true)
    protected String endretAv;

    /**
     * Gets the value of the opprettetDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpprettetDato() {
        return opprettetDato;
    }

    /**
     * Sets the value of the opprettetDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpprettetDato(XMLGregorianCalendar value) {
        this.opprettetDato = value;
    }

    /**
     * Gets the value of the opprettetAv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpprettetAv() {
        return opprettetAv;
    }

    /**
     * Sets the value of the opprettetAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpprettetAv(String value) {
        this.opprettetAv = value;
    }

    /**
     * Gets the value of the endretDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndretDato() {
        return endretDato;
    }

    /**
     * Sets the value of the endretDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndretDato(XMLGregorianCalendar value) {
        this.endretDato = value;
    }

    /**
     * Gets the value of the endretAv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndretAv() {
        return endretAv;
    }

    /**
     * Sets the value of the endretAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndretAv(String value) {
        this.endretAv = value;
    }

}
