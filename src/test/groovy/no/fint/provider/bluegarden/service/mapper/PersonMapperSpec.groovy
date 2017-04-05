package no.fint.provider.bluegarden.service.mapper

import no.fint.provider.bluegarden.soap.AdresseType
import no.fint.provider.bluegarden.soap.AnsattObject
import no.fint.provider.bluegarden.soap.KontaktinformasjonEnumType
import no.fint.provider.bluegarden.soap.KontaktinformasjonType
import spock.lang.Specification

class PersonMapperSpec extends Specification {
    private PersonMapper personMapper

    void setup() {
        personMapper = new PersonMapper()
    }

    def "Convert to resource"() {
        given:
        def ansattList = [new AnsattObject(
                fodselsnummer: '12345678901',
                fornavn: 'Ola',
                etternavn: 'Olsen',
                mobiltelefon: '12345678',
                ansattNummer: '123',
                kontaktinformasjon: [new KontaktinformasjonType(
                        kontaktinformasjonType: KontaktinformasjonEnumType.BOSTEDSADRESSE,
                        adresse: new AdresseType(
                                postnummer: '1234',
                                adresseLinje1: 'a',
                                poststed: 'b'
                        )
                )]
        )]

        when:
        def fintResource = personMapper.convertToResource(ansattList)

        then:
        fintResource.size() == 1
        fintResource[0].resource.fodselsnummer.identifikatorverdi == '12345678901'
        fintResource[0].relasjoner.size() == 1
    }
}
