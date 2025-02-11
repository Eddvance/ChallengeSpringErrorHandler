package io.eddvance.practice.challenge.controller_spring_boot_2;

import io.eddvance.practice.challenge.error_handler_exception.MyGlobalException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/spring-boot-2")
public class ControllerSpringBoot2 {

    @GetMapping("/error-page-spring-boot-2")
    public String errorPage() {
        throw new MyGlobalException("An error has occurred (with spring boot 2");
    }
    @GetMapping("/valid")
    public String ok() {
        return "Spring boot 2 valid";
    }
}