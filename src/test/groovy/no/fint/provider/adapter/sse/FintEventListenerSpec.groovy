package no.fint.provider.adapter.sse

import com.fasterxml.jackson.databind.ObjectMapper
import no.fint.event.model.Event
import no.fint.provider.bluegarden.service.EventHandlerService
import org.glassfish.jersey.media.sse.InboundEvent
import spock.lang.Specification

class FintEventListenerSpec extends Specification {
    private FintEventListener fintEventListener
    private EventHandlerService eventHandlerService
    private InboundEvent inboundEvent

    void setup() {
        inboundEvent = Mock(InboundEvent)
        eventHandlerService = Mock(EventHandlerService)
        fintEventListener = new FintEventListener(eventHandlerService, 'rogfk.no')
    }

    def "Do nothing if name is not event"() {
        when:
        fintEventListener.onEvent(inboundEvent)

        then:
        1 * inboundEvent.getName() >> 'ping'
        0 * eventHandlerService.handleEvent(_ as String)
    }

    def "Handle event"() {
        given:
        def event = new Event(corrId: 'c978c986-8d50-496f-8afd-8d27bd68049b',
                action: 'action',
                status: 'NEW',
                time: 1481116509260,
                orgId: 'rogfk.no',
                source: 'source',
                client: 'client',
                message: null,
                data: []
        )
        def json = new ObjectMapper().writeValueAsString(event)

        when:
        fintEventListener.onEvent(inboundEvent)

        then:
        1 * inboundEvent.getName() >> 'event'
        1 * inboundEvent.readData(String) >> json
        1 * eventHandlerService.handleEvent(_ as String)
    }
}
