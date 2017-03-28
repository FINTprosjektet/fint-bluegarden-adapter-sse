package no.fint.provider.bluegarden.service;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import no.fint.event.model.Event;
import no.fint.event.model.EventUtil;
import no.fint.event.model.Status;
import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.model.relation.Relation;
import no.fint.provider.adapter.Health;
import no.fint.provider.adapter.service.EventResponseService;
import no.fint.provider.adapter.service.EventStatusService;
import no.fint.provider.bluegarden.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EventHandlerService {

    @Autowired
    private EventResponseService eventResponseService;

    @Autowired
    private EventStatusService eventStatusService;

    @Autowired
    private BlueGardenService blueGardenService;

    @Autowired
    private RelationService relationService;

    @Autowired
    private OrganisationService organisationService;

    public void handleEvent(String event) {
        Event eventObj = EventUtil.toEvent(event);
        if (eventObj != null && eventStatusService.verifyEvent(eventObj).getStatus() == Status.PROVIDER_ACCEPTED) {
            Action action = Action.valueOf(eventObj.getAction());
            Event<?> responseEvent = null;

            if (action == Action.HEALTH) {
                responseEvent = onHealthCheck(event);
            }

            if (action == Action.GET_ALL_RELATIONS) {
                responseEvent = onGetAllRelations(event);
            }

            if (action == Action.GET_ALL_PERSON) {
                responseEvent = onGetAllPerson(event);
            }

            if (action == Action.GET_ALL_PERSONALRESSURS) {
                responseEvent = onGetAllPersonalressurs(event);
            }

            if (action == Action.GET_ALL_ARBEIDSFORHOLD) {
                responseEvent = onGetAllArbeidsforhold(event);
            }

            if (responseEvent != null) {
                responseEvent.setStatus(Status.PROVIDER_RESPONSE);
                eventResponseService.postResponse(responseEvent);
            }
        }
    }

    private Event<?> onGetAllRelations(String event) {
        Event<Relation> relationEvent = EventUtil.toEvent(event);

        relationEvent.setData(relationService.getRelations());

        return relationEvent;
    }

    private Event<?> onGetAllArbeidsforhold(String event) {
        Event<Arbeidsforhold> arbeidsforholdEvent = EventUtil.toEvent(event);

        arbeidsforholdEvent.setData(blueGardenService.getArbeidsforholdList());

        return arbeidsforholdEvent;
    }

    private Event<?> onGetAllPersonalressurs(String event) {
        Event<Personalressurs> personalressursEvent = EventUtil.toEvent(event);

        personalressursEvent.setData(blueGardenService.getPersonalressursList());

        return personalressursEvent;
    }

    private Event<?> onGetAllPerson(String event) {
        Event<Person> personEvent = EventUtil.toEvent(event);

        personEvent.setData(blueGardenService.getPersonList());

        return personEvent;
    }

    public Event onHealthCheck(String event) {
        Event<String> healthEvent = EventUtil.toEvent(event);

        if (healthCheck()) {
            healthEvent.setData(Lists.newArrayList(Health.APPLICATION_HEALTHY.name()));
        } else {
            healthEvent.setData(Lists.newArrayList(Health.APPLICATION_NOT_HEALTHY.name()));
            healthEvent.setMessage("The adapter is unable to communicate with the application.");
        }

        return healthEvent;
    }

    private boolean healthCheck() {

        if (organisationService.getOrganisationStructure().size() > 0) {
            return true;
        }
        return false;
    }
}
