
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SlektskapsEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SlektskapsEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Annet"/&gt;
 *     &lt;enumeration value="Barn"/&gt;
 *     &lt;enumeration value="Barnebarn"/&gt;
 *     &lt;enumeration value="Besteforeldre"/&gt;
 *     &lt;enumeration value="Bror"/&gt;
 *     &lt;enumeration value="Ektefelle"/&gt;
 *     &lt;enumeration value="Far"/&gt;
 *     &lt;enumeration value="Mor"/&gt;
 *     &lt;enumeration value="Nev\u00f8"/&gt;
 *     &lt;enumeration value="Partner"/&gt;
 *     &lt;enumeration value="RegistertPartner"/&gt;
 *     &lt;enumeration value="Samboer"/&gt;
 *     &lt;enumeration value="Slekning"/&gt;
 *     &lt;enumeration value="S\u00f8sken"/&gt;
 *     &lt;enumeration value="S\u00f8ster"/&gt;
 *     &lt;enumeration value="Tante"/&gt;
 *     &lt;enumeration value="IkkeKjent"/&gt;
 *     &lt;enumeration value="IkkeSpesifisert"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SlektskapsEnumType", namespace = "http://datatypes.bluegarden.no/object/v3")
@XmlEnum
public enum SlektskapsEnumType {

    @XmlEnumValue("Annet")
    ANNET("Annet"),
    @XmlEnumValue("Barn")
    BARN("Barn"),
    @XmlEnumValue("Barnebarn")
    BARNEBARN("Barnebarn"),
    @XmlEnumValue("Besteforeldre")
    BESTEFORELDRE("Besteforeldre"),
    @XmlEnumValue("Bror")
    BROR("Bror"),
    @XmlEnumValue("Ektefelle")
    EKTEFELLE("Ektefelle"),
    @XmlEnumValue("Far")
    FAR("Far"),
    @XmlEnumValue("Mor")
    MOR("Mor"),
    @XmlEnumValue("Nev\u00f8")
    NEV\u00d8("Nev\u00f8"),
    @XmlEnumValue("Partner")
    PARTNER("Partner"),
    @XmlEnumValue("RegistertPartner")
    REGISTERT_PARTNER("RegistertPartner"),
    @XmlEnumValue("Samboer")
    SAMBOER("Samboer"),
    @XmlEnumValue("Slekning")
    SLEKNING("Slekning"),
    @XmlEnumValue("S\u00f8sken")
    S\u00d8SKEN("S\u00f8sken"),
    @XmlEnumValue("S\u00f8ster")
    S\u00d8STER("S\u00f8ster"),
    @XmlEnumValue("Tante")
    TANTE("Tante"),
    @XmlEnumValue("IkkeKjent")
    IKKE_KJENT("IkkeKjent"),
    @XmlEnumValue("IkkeSpesifisert")
    IKKE_SPESIFISERT("IkkeSpesifisert");
    private final String value;

    SlektskapsEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SlektskapsEnumType fromValue(String v) {
        for (SlektskapsEnumType c: SlektskapsEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
