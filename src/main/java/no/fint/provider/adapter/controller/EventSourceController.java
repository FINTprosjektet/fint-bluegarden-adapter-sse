package no.fint.provider.adapter.controller;

import lombok.extern.slf4j.Slf4j;
import no.fint.provider.adapter.service.SseInitializer;
import org.glassfish.jersey.media.sse.EventSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/eventsources", produces = {MediaType.APPLICATION_JSON_VALUE})
public class EventSourceController {

    @Autowired
    SseInitializer sseInitializer;

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, EventSource> getOrganisationList() {
        return sseInitializer.getEventSources();
    }
}
