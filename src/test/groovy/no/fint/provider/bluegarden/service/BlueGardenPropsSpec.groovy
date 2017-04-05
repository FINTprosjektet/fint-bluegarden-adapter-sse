package no.fint.provider.bluegarden.service

import spock.lang.Specification

class BlueGardenPropsSpec extends Specification {

    def "Scheduling disabled"() {
        given:
        def props = new BlueGardenProps(schedulingEnabled: 'false')

        when:
        def schedulingEnabled = props.isSchedulingEnabled()

        then:
        !schedulingEnabled
    }

    def "Scheduling enabled"() {
        given:
        def props = new BlueGardenProps(schedulingEnabled: 'true')

        when:
        def schedulingEnabled = props.isSchedulingEnabled()

        then:
        schedulingEnabled
    }
}
