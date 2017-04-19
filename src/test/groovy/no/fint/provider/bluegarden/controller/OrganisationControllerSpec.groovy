package no.fint.provider.bluegarden.controller

import com.github.spock.spring.utils.MockMvcSpecification
import no.fint.provider.bluegarden.service.OrganisationService
import no.fint.provider.bluegarden.soap.OrgListItemObject
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc

import static org.hamcrest.CoreMatchers.equalTo

class OrganisationControllerSpec extends MockMvcSpecification {
    private OrganisationController controller
    private OrganisationService organisationService
    private MockMvc mockMvc

    void setup() {
        organisationService = Mock(OrganisationService)
        controller = new OrganisationController(organisationService: organisationService)
        mockMvc = standaloneSetup(controller)
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
