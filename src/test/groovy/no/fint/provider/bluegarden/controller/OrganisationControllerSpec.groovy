package no.fint.provider.bluegarden.controller

import no.fint.provider.bluegarden.service.OrganisationService
import no.fint.provider.bluegarden.soap.OrgListItemObject
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.hamcrest.CoreMatchers.equalTo
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

class OrganisationControllerSpec extends Specification {
    private OrganisationController controller
    private OrganisationService organisationService
    private MockMvc mockMvc

    void setup() {
        organisationService = Mock(OrganisationService)
        controller = new OrganisationController(organisationService: organisationService)
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build()
    }

    def "Get organisation list"() {
        when:
        def response = mockMvc.perform(get('/organisation'))

        then:
        1 * organisationService.getOrganisationStructure() >> [new OrgListItemObject(orgUnitId: '123')]
        response.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath('$[0].orgUnitId').value(equalTo('123')))
    }
}
