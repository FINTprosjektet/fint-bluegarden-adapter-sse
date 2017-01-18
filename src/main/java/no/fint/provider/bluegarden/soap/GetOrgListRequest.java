
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Arbeidsgiver"&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                   &lt;minLength value="1"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="OrgUnitId"&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                   &lt;minLength value="1"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *             &lt;/element&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="GroupId"&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                   &lt;minLength value="1"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *             &lt;/element&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arbeidsgiver",
    "orgUnitId",
    "groupId"
})
@XmlRootElement(name = "getOrgListRequest", namespace = "http://bluegarden.no/organisation/structure/service/v31")
public class GetOrgListRequest {

    @XmlElement(name = "Arbeidsgiver", namespace = "http://bluegarden.no/organisation/structure/service/v31")
    protected String arbeidsgiver;
    @XmlElement(name = "OrgUnitId", namespace = "http://bluegarden.no/organisation/structure/service/v31")
    protected String orgUnitId;
    @XmlElement(name = "GroupId", namespace = "http://bluegarden.no/organisation/structure/service/v31")
    protected String groupId;

    /**
     * Gets the value of the arbeidsgiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbeidsgiver() {
        return arbeidsgiver;
    }

    /**
     * Sets the value of the arbeidsgiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbeidsgiver(String value) {
        this.arbeidsgiver = value;
    }

    /**
     * Gets the value of the orgUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitId() {
        return orgUnitId;
    }

    /**
     * Sets the value of the orgUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitId(String value) {
        this.orgUnitId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

}
