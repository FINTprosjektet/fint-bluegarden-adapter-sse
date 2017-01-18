
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KontaktinformasjonEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KontaktinformasjonEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Internadresse"/&gt;
 *     &lt;enumeration value="Bostedsadresse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KontaktinformasjonEnumType", namespace = "http://ansattlist.bluegarden.no/object/v3_1")
@XmlEnum
public enum KontaktinformasjonEnumType {

    @XmlEnumValue("Internadresse")
    INTERNADRESSE("Internadresse"),
    @XmlEnumValue("Bostedsadresse")
    BOSTEDSADRESSE("Bostedsadresse");
    private final String value;

    KontaktinformasjonEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KontaktinformasjonEnumType fromValue(String v) {
        for (KontaktinformasjonEnumType c: KontaktinformasjonEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
