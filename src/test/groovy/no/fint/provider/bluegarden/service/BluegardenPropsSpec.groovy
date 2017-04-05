package no.fint.provider.bluegarden.service

import spock.lang.Specification

class BluegardenPropsSpec extends Specification {

    def "Scheduling disabled"() {
        given:
        def props = new BluegardenProps(schedulingEnabled: 'false')

        when:
        def schedulingEnabled = props.isSchedulingEnabled()

        then:
        !schedulingEnabled
    }

    def "Scheduling enabled"() {
        given:
        def props = new BluegardenProps(schedulingEnabled: 'true')

        when:
        def schedulingEnabled = props.isSchedulingEnabled()

        then:
        schedulingEnabled
    }
}
