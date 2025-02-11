package io.eddvance.practice.challenge.controller_spring_boot_3;

import io.eddvance.practice.challenge.error_handler_exception.MyGlobalException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/spring-boot-3")
public class ControllerSpringBoot3 {

    @Operation(summary = "ProblemDetail handler")
    @ApiResponse(responseCode = "400", description = "ProblemDetail handler(MyGlobalException)")
    @GetMapping("/error-page-sb3")
    public String errorPage() {
        throw new MyGlobalException("An error has occurred (with spring boot 3");
    }
    @Operation(summary = "no error endpoint")
    @ApiResponse(responseCode = "200", description = "Valid response")
    @GetMapping("/valid")
    public String ok() {
        return "spring boot 3 valid";
    }
}