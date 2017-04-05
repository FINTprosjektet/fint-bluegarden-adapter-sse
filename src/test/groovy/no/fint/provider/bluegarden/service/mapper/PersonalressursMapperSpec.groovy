package no.fint.provider.bluegarden.service.mapper

import no.fint.provider.bluegarden.soap.AnsattObject
import no.fint.provider.bluegarden.soap.ArbeidsforholdType
import spock.lang.Specification

class PersonalressursMapperSpec extends Specification {
    private PersonalressursMapper personalressursMapper

    void setup() {
        personalressursMapper = new PersonalressursMapper()
    }

    def "Convert to resource"() {
        given:
        def ansattList = [new AnsattObject(
                ansattNummer: '123',
                fornavn: 'Ole',
                etternavn: 'Olsen',
                mobiltelefon: '12345678',
                fodselsnummer: '12345678901',
                arbeidsforhold: [new ArbeidsforholdType(
                        arbeidsforholdnummer: '234'
                )]
        )]

        when:
        def fintResource = personalressursMapper.convertToResource(ansattList)

        then:
        fintResource.size() == 1
        fintResource[0].resource.ansattnummer.identifikatorverdi == '123'
        fintResource[0].relasjoner.size() == 2
    }
}
