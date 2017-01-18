
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * List of org units
 * 
 * <p>Java class for OrgListObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgListObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgUnit" type="{http://bluegarden.no/organisation/structure/object/v31}OrgListItemObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgListObject", namespace = "http://bluegarden.no/organisation/structure/object/v31", propOrder = {
    "orgUnit"
})
public class OrgListObject {

    @XmlElement(name = "OrgUnit")
    protected List<OrgListItemObject> orgUnit;

    /**
     * Gets the value of the orgUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgListItemObject }
     * 
     * 
     */
    public List<OrgListItemObject> getOrgUnit() {
        if (orgUnit == null) {
            orgUnit = new ArrayList<OrgListItemObject>();
        }
        return this.orgUnit;
    }

}
