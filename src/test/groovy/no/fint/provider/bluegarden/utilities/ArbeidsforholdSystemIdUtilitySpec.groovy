package no.fint.provider.bluegarden.utilities

import spock.lang.Specification

class ArbeidsforholdSystemIdUtilitySpec extends Specification {

    def "Get system id"() {
        when:
        def systemId = ArbeidsforholdSystemIdUtility.getSystemId('123', '234')

        then:
        systemId == 'hfk.no:123:234'
    }
}
