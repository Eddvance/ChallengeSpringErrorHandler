package io.eddvance.practice.challenge.fevrier25_01.error_handler_global.error_handler_springboot2.controller_spring_boot_2;

import io.eddvance.practice.challenge.fevrier25_01.error_handler_global.error_handling_exceptions.HandleHttpProblemExceptionSb2;
import org.springframework.web.bind.annotation.GetMapping;

public class ControllerSpringBoot2 {

    @GetMapping("/error-page-spring-boot-2")
    public String GenerateEndpoint() {
        throw new HandleHttpProblemExceptionSb2("An error has occurred");
    }
}