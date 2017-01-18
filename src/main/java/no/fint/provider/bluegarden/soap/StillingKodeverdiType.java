
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StillingKodeverdiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StillingKodeverdiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://kodeverk.bluegarden.no/object/v1}KodeverdiType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stillingsbetegnelse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StillingKodeverdiType", namespace = "http://kodeverk.bluegarden.no/object/v1", propOrder = {
    "stillingsbetegnelse"
})
public class StillingKodeverdiType
    extends KodeverdiType
{

    @XmlElement(name = "Stillingsbetegnelse")
    protected String stillingsbetegnelse;

    /**
     * Gets the value of the stillingsbetegnelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStillingsbetegnelse() {
        return stillingsbetegnelse;
    }

    /**
     * Sets the value of the stillingsbetegnelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStillingsbetegnelse(String value) {
        this.stillingsbetegnelse = value;
    }

}
