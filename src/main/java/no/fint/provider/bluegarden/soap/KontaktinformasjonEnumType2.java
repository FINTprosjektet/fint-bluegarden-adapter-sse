
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
 *     &lt;enumeration value="Annet"/&gt;
 *     &lt;enumeration value="Bosted"/&gt;
 *     &lt;enumeration value="Forretningsadresse"/&gt;
 *     &lt;enumeration value="Intern"/&gt;
 *     &lt;enumeration value="Juridisk"/&gt;
 *     &lt;enumeration value="Lonnsslipp"/&gt;
 *     &lt;enumeration value="Tjeneste"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KontaktinformasjonEnumType")
@XmlEnum
public enum KontaktinformasjonEnumType2 {

    @XmlEnumValue("Annet")
    ANNET("Annet"),
    @XmlEnumValue("Bosted")
    BOSTED("Bosted"),
    @XmlEnumValue("Forretningsadresse")
    FORRETNINGSADRESSE("Forretningsadresse"),
    @XmlEnumValue("Intern")
    INTERN("Intern"),
    @XmlEnumValue("Juridisk")
    JURIDISK("Juridisk"),
    @XmlEnumValue("Lonnsslipp")
    LONNSSLIPP("Lonnsslipp"),
    @XmlEnumValue("Tjeneste")
    TJENESTE("Tjeneste");
    private final String value;

    KontaktinformasjonEnumType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KontaktinformasjonEnumType2 fromValue(String v) {
        for (KontaktinformasjonEnumType2 c: KontaktinformasjonEnumType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
