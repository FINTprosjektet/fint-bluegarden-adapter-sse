
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SivilstatusEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SivilstatusEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Annet"/&gt;
 *     &lt;enumeration value="Enke/-mann"/&gt;
 *     &lt;enumeration value="Gift"/&gt;
 *     &lt;enumeration value="RegistertPartner"/&gt;
 *     &lt;enumeration value="Samboer"/&gt;
 *     &lt;enumeration value="Separert"/&gt;
 *     &lt;enumeration value="Skilt"/&gt;
 *     &lt;enumeration value="Ugift"/&gt;
 *     &lt;enumeration value="IkkeKjent"/&gt;
 *     &lt;enumeration value="IkkeSpesifisert"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SivilstatusEnumType", namespace = "http://datatypes.bluegarden.no/object/v3")
@XmlEnum
public enum SivilstatusEnumType {

    @XmlEnumValue("Annet")
    ANNET("Annet"),
    @XmlEnumValue("Enke/-mann")
    ENKE_MANN("Enke/-mann"),
    @XmlEnumValue("Gift")
    GIFT("Gift"),
    @XmlEnumValue("RegistertPartner")
    REGISTERT_PARTNER("RegistertPartner"),
    @XmlEnumValue("Samboer")
    SAMBOER("Samboer"),
    @XmlEnumValue("Separert")
    SEPARERT("Separert"),
    @XmlEnumValue("Skilt")
    SKILT("Skilt"),
    @XmlEnumValue("Ugift")
    UGIFT("Ugift"),
    @XmlEnumValue("IkkeKjent")
    IKKE_KJENT("IkkeKjent"),
    @XmlEnumValue("IkkeSpesifisert")
    IKKE_SPESIFISERT("IkkeSpesifisert");
    private final String value;

    SivilstatusEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SivilstatusEnumType fromValue(String v) {
        for (SivilstatusEnumType c: SivilstatusEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
