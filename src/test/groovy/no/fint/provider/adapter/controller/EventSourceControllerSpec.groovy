package no.fint.provider.adapter.controller

import no.fint.provider.adapter.service.SseInitializer
import org.glassfish.jersey.media.sse.EventSource
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.hamcrest.CoreMatchers.equalTo
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

class EventSourceControllerSpec extends Specification {
    private EventSourceController controller
    private SseInitializer sseInitializer
    private MockMvc mockMvc

    void setup() {
        sseInitializer = Mock(SseInitializer)
        controller = new EventSourceController(sseInitializer: sseInitializer)
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build()
    }

    def "Get organisation list"() {
        when:
        def response = mockMvc.perform(get('/eventsources'))

        then:
        1 * sseInitializer.getEventSources() >> ['rfk.no': Mock(EventSource)]
        response.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath('$[0]').value(equalTo('rfk.no')))
    }
}
