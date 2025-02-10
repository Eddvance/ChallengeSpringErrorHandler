package io.eddvance.practice.challenge.controller_spring_boot_3;

import io.eddvance.practice.challenge.error_handler_exception.MyGlobalException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/spring-boot-3")
@RestController
public class ControllerSpringBoot3 {

    @GetMapping("/error-page-spring-boot-3")
    public String errorPage() {
        throw new MyGlobalException("An error has occurred (with spring boot 3");
    }
}