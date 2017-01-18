
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArbeidsforholdStatusEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArbeidsforholdStatusEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Aktiv"/&gt;
 *     &lt;enumeration value="Permisjon"/&gt;
 *     &lt;enumeration value="Sluttet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArbeidsforholdStatusEnumType", namespace = "http://ansattlist.bluegarden.no/object/v3_1")
@XmlEnum
public enum ArbeidsforholdStatusEnumType {

    @XmlEnumValue("Aktiv")
    AKTIV("Aktiv"),
    @XmlEnumValue("Permisjon")
    PERMISJON("Permisjon"),
    @XmlEnumValue("Sluttet")
    SLUTTET("Sluttet");
    private final String value;

    ArbeidsforholdStatusEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArbeidsforholdStatusEnumType fromValue(String v) {
        for (ArbeidsforholdStatusEnumType c: ArbeidsforholdStatusEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
