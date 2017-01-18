
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AnsattListObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnsattListObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ansatt" type="{http://ansattlist.bluegarden.no/object/v3_1}AnsattObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnsattListObject", namespace = "http://ansattlist.bluegarden.no/object/v3_1", propOrder = {
    "ansatt"
})
public class AnsattListObject {

    @XmlElement(name = "Ansatt")
    protected List<AnsattObject> ansatt;

    /**
     * Gets the value of the ansatt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ansatt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnsatt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnsattObject }
     * 
     * 
     */
    public List<AnsattObject> getAnsatt() {
        if (ansatt == null) {
            ansatt = new ArrayList<AnsattObject>();
        }
        return this.ansatt;
    }

}
