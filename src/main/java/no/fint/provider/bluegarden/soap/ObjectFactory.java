
package no.fint.provider.bluegarden.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.bluegarden package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAnsattListRequestMessage_QNAME = new QName("http://ansattlist.bluegarden.no/service/v3_1", "GetAnsattListRequestMessage");
    private final static QName _GetAnsattListResultMessage_QNAME = new QName("http://ansattlist.bluegarden.no/service/v3_1", "GetAnsattListResultMessage");
    private final static QName _Kodeverk_QNAME = new QName("http://kodeverk.bluegarden.no/object/v1", "Kodeverk");
    private final static QName _BSBHeader_QNAME = new QName("http://bluemsg.bluegarden.no/object/v3", "BSBHeader");
    private final static QName _AnsattList_QNAME = new QName("http://ansattlist.bluegarden.no/object/v3_1", "AnsattList");
    private final static QName _Person_QNAME = new QName("http://common.bluegarden.no/object/v1_5", "Person");
    private final static QName _Familiemedlem_QNAME = new QName("http://common.bluegarden.no/object/v1_5", "Familiemedlem");
    private final static QName _Personnavn_QNAME = new QName("http://common.bluegarden.no/object/v1_5", "Personnavn");
    private final static QName _Adresse_QNAME = new QName("http://common.bluegarden.no/object/v1_5", "Adresse");
    private final static QName _Kontaktinformasjon_QNAME = new QName("http://common.bluegarden.no/object/v1_5", "Kontaktinformasjon");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.bluegarden
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KontaktinformasjonType2 }
     * 
     */
    public KontaktinformasjonType2 createKontaktinformasjonType2() {
        return new KontaktinformasjonType2();
    }

    /**
     * Create an instance of {@link GetAnsattListRequestMessageType }
     * 
     */
    public GetAnsattListRequestMessageType createGetAnsattListRequestMessageType() {
        return new GetAnsattListRequestMessageType();
    }

    /**
     * Create an instance of {@link GetAnsattListResultMessageType }
     * 
     */
    public GetAnsattListResultMessageType createGetAnsattListResultMessageType() {
        return new GetAnsattListResultMessageType();
    }

    /**
     * Create an instance of {@link KodeverkObject }
     * 
     */
    public KodeverkObject createKodeverkObject() {
        return new KodeverkObject();
    }

    /**
     * Create an instance of {@link KodeverdiType }
     * 
     */
    public KodeverdiType createKodeverdiType() {
        return new KodeverdiType();
    }

    /**
     * Create an instance of {@link KodeverdiDecimalType }
     * 
     */
    public KodeverdiDecimalType createKodeverdiDecimalType() {
        return new KodeverdiDecimalType();
    }

    /**
     * Create an instance of {@link StillingKodeverdiType }
     * 
     */
    public StillingKodeverdiType createStillingKodeverdiType() {
        return new StillingKodeverdiType();
    }

    /**
     * Create an instance of {@link BSBHeaderType }
     * 
     */
    public BSBHeaderType createBSBHeaderType() {
        return new BSBHeaderType();
    }

    /**
     * Create an instance of {@link AnsattListObject }
     * 
     */
    public AnsattListObject createAnsattListObject() {
        return new AnsattListObject();
    }

    /**
     * Create an instance of {@link AnsattObject }
     * 
     */
    public AnsattObject createAnsattObject() {
        return new AnsattObject();
    }

    /**
     * Create an instance of {@link KontaktinformasjonType }
     * 
     */
    public KontaktinformasjonType createKontaktinformasjonType() {
        return new KontaktinformasjonType();
    }

    /**
     * Create an instance of {@link ArbeidsforholdType }
     * 
     */
    public ArbeidsforholdType createArbeidsforholdType() {
        return new ArbeidsforholdType();
    }

    /**
     * Create an instance of {@link PersonObject }
     * 
     */
    public PersonObject createPersonObject() {
        return new PersonObject();
    }

    /**
     * Create an instance of {@link FamiliemedlemType }
     * 
     */
    public FamiliemedlemType createFamiliemedlemType() {
        return new FamiliemedlemType();
    }

    /**
     * Create an instance of {@link PersonNavnType }
     * 
     */
    public PersonNavnType createPersonNavnType() {
        return new PersonNavnType();
    }

    /**
     * Create an instance of {@link AdresseType }
     * 
     */
    public AdresseType createAdresseType() {
        return new AdresseType();
    }

    /**
     * Create an instance of {@link TelefonnummerType }
     * 
     */
    public TelefonnummerType createTelefonnummerType() {
        return new TelefonnummerType();
    }

    /**
     * Create an instance of {@link AuditInfoType }
     * 
     */
    public AuditInfoType createAuditInfoType() {
        return new AuditInfoType();
    }

    /**
     * Create an instance of {@link Periode }
     * 
     */
    public Periode createPeriode() {
        return new Periode();
    }

    /**
     * Create an instance of {@link EntityIdType }
     * 
     */
    public EntityIdType createEntityIdType() {
        return new EntityIdType();
    }

    /**
     * Create an instance of {@link UserAreaType }
     * 
     */
    public UserAreaType createUserAreaType() {
        return new UserAreaType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link PercentType }
     * 
     */
    public PercentType createPercentType() {
        return new PercentType();
    }

    /**
     * Create an instance of {@link BinaryObjectType }
     * 
     */
    public BinaryObjectType createBinaryObjectType() {
        return new BinaryObjectType();
    }

    /**
     * Create an instance of {@link KontaktinformasjonType2 .Mobiltelefon }
     * 
     */
    public KontaktinformasjonType2 .Mobiltelefon createKontaktinformasjonType2Mobiltelefon() {
        return new KontaktinformasjonType2 .Mobiltelefon();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnsattListRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ansattlist.bluegarden.no/service/v3_1", name = "GetAnsattListRequestMessage")
    public JAXBElement<GetAnsattListRequestMessageType> createGetAnsattListRequestMessage(GetAnsattListRequestMessageType value) {
        return new JAXBElement<GetAnsattListRequestMessageType>(_GetAnsattListRequestMessage_QNAME, GetAnsattListRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnsattListResultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ansattlist.bluegarden.no/service/v3_1", name = "GetAnsattListResultMessage")
    public JAXBElement<GetAnsattListResultMessageType> createGetAnsattListResultMessage(GetAnsattListResultMessageType value) {
        return new JAXBElement<GetAnsattListResultMessageType>(_GetAnsattListResultMessage_QNAME, GetAnsattListResultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KodeverkObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kodeverk.bluegarden.no/object/v1", name = "Kodeverk")
    public JAXBElement<KodeverkObject> createKodeverk(KodeverkObject value) {
        return new JAXBElement<KodeverkObject>(_Kodeverk_QNAME, KodeverkObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BSBHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bluemsg.bluegarden.no/object/v3", name = "BSBHeader")
    public JAXBElement<BSBHeaderType> createBSBHeader(BSBHeaderType value) {
        return new JAXBElement<BSBHeaderType>(_BSBHeader_QNAME, BSBHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnsattListObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ansattlist.bluegarden.no/object/v3_1", name = "AnsattList")
    public JAXBElement<AnsattListObject> createAnsattList(AnsattListObject value) {
        return new JAXBElement<AnsattListObject>(_AnsattList_QNAME, AnsattListObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.bluegarden.no/object/v1_5", name = "Person")
    public JAXBElement<PersonObject> createPerson(PersonObject value) {
        return new JAXBElement<PersonObject>(_Person_QNAME, PersonObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamiliemedlemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.bluegarden.no/object/v1_5", name = "Familiemedlem")
    public JAXBElement<FamiliemedlemType> createFamiliemedlem(FamiliemedlemType value) {
        return new JAXBElement<FamiliemedlemType>(_Familiemedlem_QNAME, FamiliemedlemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNavnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.bluegarden.no/object/v1_5", name = "Personnavn")
    public JAXBElement<PersonNavnType> createPersonnavn(PersonNavnType value) {
        return new JAXBElement<PersonNavnType>(_Personnavn_QNAME, PersonNavnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdresseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.bluegarden.no/object/v1_5", name = "Adresse")
    public JAXBElement<AdresseType> createAdresse(AdresseType value) {
        return new JAXBElement<AdresseType>(_Adresse_QNAME, AdresseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KontaktinformasjonType2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.bluegarden.no/object/v1_5", name = "Kontaktinformasjon")
    public JAXBElement<KontaktinformasjonType2> createKontaktinformasjon(KontaktinformasjonType2 value) {
        return new JAXBElement<KontaktinformasjonType2>(_Kontaktinformasjon_QNAME, KontaktinformasjonType2 .class, null, value);
    }

}
