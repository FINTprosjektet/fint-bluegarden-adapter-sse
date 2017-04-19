package no.fint.provider.bluegarden.controller

import com.github.spock.spring.utils.MockMvcSpecification
import no.fint.model.administrasjon.personal.Arbeidsforhold
import no.fint.model.administrasjon.personal.Personalressurs
import no.fint.model.felles.Identifikator
import no.fint.model.felles.Person
import no.fint.model.relation.FintResource
import no.fint.provider.bluegarden.service.BlueGardenService
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc

import static org.hamcrest.CoreMatchers.equalTo

class PersonalControllerSpec extends MockMvcSpecification {
    private PersonalController controller
    private BlueGardenService blueGardenService
    private MockMvc mockMvc

    void setup() {
        blueGardenService = Mock(BlueGardenService)
        controller = new PersonalController(blueGardenService: blueGardenService)
        mockMvc = standaloneSetup(controller)
    }

    def "Get person list"() {
        when:
        def response = mockMvc.perform(get('/person'))

        then:
        1 * blueGardenService.getPersonList() >> [FintResource.with(new Person(fodselsnummer: new Identifikator(identifikatorverdi: '123')))]
        response.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath('$[0].resource.fodselsnummer.identifikatorverdi').value(equalTo('123')))
    }

    def "Get personalressurs list"() {
        when:
        def response = mockMvc.perform(get('/personalressurs'))

        then:
        1 * blueGardenService.getPersonalressursList() >> [FintResource.with(new Personalressurs(ansattnummer: new Identifikator(identifikatorverdi: '234')))]
        response.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath('$[0].resource.ansattnummer.identifikatorverdi').value(equalTo('234')))
    }

    def "Get arbeidsforhold list"() {
        when:
        def response = mockMvc.perform(get('/arbeidsforhold'))

        then:
        1 * blueGardenService.getArbeidsforholdList() >> [FintResource.with(new Arbeidsforhold(systemId: new Identifikator(identifikatorverdi: '345')))]
        response.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath('$[0].resource.systemId.identifikatorverdi').value(equalTo('345')))
    }

    def "Refresh Bluegarden data"() {
        when:
        def response = mockMvc.perform(get('/refresh'))

        then:
        1 * blueGardenService.getBlueGardenData()
        response.andExpect(status().isOk())
    }
}
