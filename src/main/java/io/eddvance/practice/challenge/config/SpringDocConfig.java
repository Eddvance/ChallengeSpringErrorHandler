package io.eddvance.practice.challenge.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "",
                version = "",
                description = "ErrorHandler Spring Boot 2 vs Spring Boot 3"
        )
)
public class SpringDocConfig {
}
