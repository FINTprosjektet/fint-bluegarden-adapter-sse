package no.fint.provider.bluegarden.service.mapper

import no.fint.provider.bluegarden.soap.AnsattObject
import no.fint.provider.bluegarden.soap.ArbeidsforholdStatusEnumType
import no.fint.provider.bluegarden.soap.ArbeidsforholdType
import spock.lang.Specification

import javax.xml.datatype.DatatypeFactory
import javax.xml.datatype.XMLGregorianCalendar

class ArbeidsforholdMapperSpec extends Specification {
    private ArbeidsforholdMapper arbeidsforholdMapper

    void setup() {
        arbeidsforholdMapper = new ArbeidsforholdMapper()
    }

    def "Convert to resource"() {
        given:
        GregorianCalendar c = new GregorianCalendar()
        c.setTime(new Date())
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c)

        def ansattList = [new AnsattObject(
                ansattNummer: '123',
                arbeidsforhold: [new ArbeidsforholdType(
                        status: ArbeidsforholdStatusEnumType.AKTIV,
                        startdato: date,
                        stoppdato: date,
                        arbeidsforholdnummer: '234',
                        isHovedarbeidsforhold: true,
                        orgUnitId: '345'
                )])]

        when:
        def fintResource = arbeidsforholdMapper.convertToResource(ansattList)

        then:
        fintResource.size() == 1
        fintResource[0].relasjoner.size() == 2
    }
}
