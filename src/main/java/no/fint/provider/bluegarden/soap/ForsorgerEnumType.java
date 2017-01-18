
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForsorgerEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForsorgerEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IkkeForsorger"/&gt;
 *     &lt;enumeration value="EneForsorger"/&gt;
 *     &lt;enumeration value="DeltForsorgerskap"/&gt;
 *     &lt;enumeration value="IkkeKjent"/&gt;
 *     &lt;enumeration value="IkkeSpesifisert"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForsorgerEnumType", namespace = "http://datatypes.bluegarden.no/object/v3")
@XmlEnum
public enum ForsorgerEnumType {

    @XmlEnumValue("IkkeForsorger")
    IKKE_FORSORGER("IkkeForsorger"),
    @XmlEnumValue("EneForsorger")
    ENE_FORSORGER("EneForsorger"),
    @XmlEnumValue("DeltForsorgerskap")
    DELT_FORSORGERSKAP("DeltForsorgerskap"),
    @XmlEnumValue("IkkeKjent")
    IKKE_KJENT("IkkeKjent"),
    @XmlEnumValue("IkkeSpesifisert")
    IKKE_SPESIFISERT("IkkeSpesifisert");
    private final String value;

    ForsorgerEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForsorgerEnumType fromValue(String v) {
        for (ForsorgerEnumType c: ForsorgerEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
