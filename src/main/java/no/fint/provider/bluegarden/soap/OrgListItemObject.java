
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Inneholder informasjon om en organisasjonsenhets
 * 
 * <p>Java class for OrgListItemObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgListItemObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrgNavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErAktiv" type="{http://datatypes.bluegarden.no/object/v3}IndicatorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgListItemObject", namespace = "http://bluegarden.no/organisation/structure/object/v31", propOrder = {
    "orgUnitId",
    "orgNavn",
    "groupId",
    "parentGroupId",
    "erAktiv"
})
public class OrgListItemObject {

    @XmlElement(name = "OrgUnitId")
    protected String orgUnitId;
    @XmlElement(name = "OrgNavn")
    protected String orgNavn;
    @XmlElement(name = "GroupId")
    protected String groupId;
    @XmlElement(name = "ParentGroupId")
    protected String parentGroupId;
    @XmlElement(name = "ErAktiv")
    protected Boolean erAktiv;

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
     * Gets the value of the orgNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNavn() {
        return orgNavn;
    }

    /**
     * Sets the value of the orgNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNavn(String value) {
        this.orgNavn = value;
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

    /**
     * Gets the value of the parentGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGroupId() {
        return parentGroupId;
    }

    /**
     * Sets the value of the parentGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGroupId(String value) {
        this.parentGroupId = value;
    }

    /**
     * Gets the value of the erAktiv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErAktiv() {
        return erAktiv;
    }

    /**
     * Sets the value of the erAktiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErAktiv(Boolean value) {
        this.erAktiv = value;
    }

}
