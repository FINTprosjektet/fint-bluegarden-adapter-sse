package no.fint.provider;

import com.github.springfox.loader.EnableSpringfox;
import no.fint.dependencies.FintDependenciesController;
import no.fint.dependencies.annotations.EnableFintDependencies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@EnableSpringfox(includeControllers = FintDependenciesController.class)
@EnableFintDependencies
@EnableScheduling
@EnableAsync
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
