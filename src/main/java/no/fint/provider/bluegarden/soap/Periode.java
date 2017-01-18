
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Periode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Periode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDato" type="{http://datatypes.bluegarden.no/object/v3}DateType" minOccurs="0"/&gt;
 *         &lt;element name="SluttDato" type="{http://datatypes.bluegarden.no/object/v3}DateType"/&gt;
 *         &lt;element name="ErPagaende" type="{http://datatypes.bluegarden.no/object/v3}IndicatorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Periode", propOrder = {
    "startDato",
    "sluttDato",
    "erPagaende"
})
public class Periode {

    @XmlElement(name = "StartDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDato;
    @XmlElement(name = "SluttDato", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sluttDato;
    @XmlElement(name = "ErPagaende")
    protected Boolean erPagaende;

    /**
     * Gets the value of the startDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDato() {
        return startDato;
    }

    /**
     * Sets the value of the startDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDato(XMLGregorianCalendar value) {
        this.startDato = value;
    }

    /**
     * Gets the value of the sluttDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSluttDato() {
        return sluttDato;
    }

    /**
     * Sets the value of the sluttDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSluttDato(XMLGregorianCalendar value) {
        this.sluttDato = value;
    }

    /**
     * Gets the value of the erPagaende property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErPagaende() {
        return erPagaende;
    }

    /**
     * Sets the value of the erPagaende property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErPagaende(Boolean value) {
        this.erPagaende = value;
    }

}
