package no.fint.provider.adapter.service

import no.fint.event.model.Event
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

class EventResponseServiceSpec extends Specification {
    private EventResponseService eventResponseService
    private RestTemplate restTemplate

    void setup() {
        restTemplate = Mock(RestTemplate)
        eventResponseService = new EventResponseService(responseEndpoint: 'http://localhost', restTemplate: restTemplate)
    }

    def "Post response"() {
        when:
        eventResponseService.postResponse(new Event())

        then:
        1 * restTemplate.exchange('http://localhost', HttpMethod.POST, _ as HttpEntity, Void) >> ResponseEntity.ok().build()
    }


}
