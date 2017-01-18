
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAnsattListResultMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAnsattListResultMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ansattlist.bluegarden.no/object/v3_1}AnsattList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAnsattListResultMessageType", namespace = "http://ansattlist.bluegarden.no/service/v3_1", propOrder = {
    "ansattList"
})
public class GetAnsattListResultMessageType {

    @XmlElement(name = "AnsattList", namespace = "http://ansattlist.bluegarden.no/object/v3_1", required = true)
    protected AnsattListObject ansattList;

    /**
     * Gets the value of the ansattList property.
     * 
     * @return
     *     possible object is
     *     {@link AnsattListObject }
     *     
     */
    public AnsattListObject getAnsattList() {
        return ansattList;
    }

    /**
     * Sets the value of the ansattList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsattListObject }
     *     
     */
    public void setAnsattList(AnsattListObject value) {
        this.ansattList = value;
    }

}
