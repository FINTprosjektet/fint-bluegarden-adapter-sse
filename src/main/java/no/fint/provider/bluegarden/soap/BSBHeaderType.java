
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Header som normalt sett er med i alle meldinger
 * 
 * <p>Java class for BSBHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BSBHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceCompany" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SourceEmployer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SourceUser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageId" type="{http://bluemsg.bluegarden.no/object/v3}LimitedString200"/&gt;
 *         &lt;element name="UserArea" type="{http://datatypes.bluegarden.no/object/v3}UserAreaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BSBHeaderType", namespace = "http://bluemsg.bluegarden.no/object/v3", propOrder = {
    "sourceCompany",
    "sourceEmployer",
    "sourceSystem",
    "sourceUser",
    "messageId",
    "userArea"
})
public class BSBHeaderType {

    @XmlElement(name = "SourceCompany", namespace = "", required = true)
    protected String sourceCompany;
    @XmlElement(name = "SourceEmployer", namespace = "", required = true)
    protected List<String> sourceEmployer;
    @XmlElement(name = "SourceSystem", namespace = "", required = true)
    protected String sourceSystem;
    @XmlElement(name = "SourceUser", namespace = "", required = true)
    protected String sourceUser;
    @XmlElement(name = "MessageId", namespace = "", required = true)
    protected String messageId;
    @XmlElement(name = "UserArea", namespace = "")
    protected UserAreaType userArea;

    /**
     * Gets the value of the sourceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCompany() {
        return sourceCompany;
    }

    /**
     * Sets the value of the sourceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCompany(String value) {
        this.sourceCompany = value;
    }

    /**
     * Gets the value of the sourceEmployer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceEmployer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSourceEmployer() {
        if (sourceEmployer == null) {
            sourceEmployer = new ArrayList<String>();
        }
        return this.sourceEmployer;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the sourceUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUser() {
        return sourceUser;
    }

    /**
     * Sets the value of the sourceUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUser(String value) {
        this.sourceUser = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the userArea property.
     * 
     * @return
     *     possible object is
     *     {@link UserAreaType }
     *     
     */
    public UserAreaType getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAreaType }
     *     
     */
    public void setUserArea(UserAreaType value) {
        this.userArea = value;
    }

}
