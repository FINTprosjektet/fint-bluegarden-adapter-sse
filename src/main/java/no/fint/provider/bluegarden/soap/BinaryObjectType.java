
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;


/**
 * Datatype for overf\u00f8ring av bin\u00e6re data. Mottaker av data m\u00e5 forsikre seg om at det er en godkjent mimeCode mottatt og at innholdet ikke inneholder kan f\u00e5f\u00f8re noen skade. Jvn "Malicious File Execution"
 * 
 * <p>Java class for BinaryObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryObjectType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *       &lt;attribute name="mimeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="characterSetCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryObjectType", namespace = "http://datatypes.bluegarden.no/object/v3", propOrder = {
    "value"
})
public class BinaryObjectType {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "mimeCode")
    protected String mimeCode;
    @XmlAttribute(name = "characterSetCode")
    protected String characterSetCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the mimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeCode() {
        return mimeCode;
    }

    /**
     * Sets the value of the mimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeCode(String value) {
        this.mimeCode = value;
    }

    /**
     * Gets the value of the characterSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * Sets the value of the characterSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSetCode(String value) {
        this.characterSetCode = value;
    }

}
