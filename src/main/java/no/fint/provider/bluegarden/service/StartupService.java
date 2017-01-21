package no.fint.provider.bluegarden.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class StartupService {

    @Value("${bluegarden.employee-endpoint}")
    private String employeeEnpoint;

    @Value("${bluegarden.org-endpoint}")
    private String orgEnpoint;

    @Value("${bluegarden.username}")
    private String username;

    @Value("${bluegarden.password}")
    private String password;

    @Value("${bluegarden.employer}")
    private String employer;

    @Value("${bluegarden.orgunitid}")
    private String orgUnitId;

    @Value("${bluegarden.source-company}")
    private String sourceCompany;

    @Value("${bluegarden.source-system}")
    private String sourceSystem;

    @Value("${bluegarden.source-user}")
    private String sourceUser;

    @Value("${bluegarden.source-employer}")
    private String sourceEmployer;

    @PostConstruct
    public void init() {

        log.info("bluegarden.employee-endpoint: {}", employeeEnpoint);
        log.info("bluegarden.org-endpoint: {}", orgEnpoint);
        log.info("bluegarden.username: {}", username);
        log.info("bluegarden.password: {}", password);
        log.info("bluegarden.employer: {}", employer);
        log.info("bluegarden.orgunitid: {}", orgUnitId);
        log.info("bluegarden.source-company: {}", sourceCompany);
        log.info("bluegarden.source-user: {}", sourceUser);
        log.info("bluegarden.source-employer: {}", sourceEmployer);
    }
}
