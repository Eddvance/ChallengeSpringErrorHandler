package io.eddvance.practice.challenge.controller_spring_boot_2;

import io.eddvance.practice.challenge.error_handler_exception.MyGlobalException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/spring-boot-2")
public class ControllerSpringBoot2 {

    @Operation(summary = "Simule une erreur côté SB2", description = "Jette MyGlobalException gérée par SB2")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Erreur gérée par SB2"),
            @ApiResponse(responseCode = "200", description = "OK si aucune exception")
            //@ApiResponse();
           // @ApiResponse();
    })
    @GetMapping("/error-page-sb2")
    public String errorPage() {
        throw new MyGlobalException("An error has occurred (with spring boot 2");
    }

    @Operation(summary = "No error Endpoint", description = "succes message")
    @ApiResponse(responseCode = "200", description = "Response valid")
    @GetMapping("/valid")
    public String ok() {
        return "Spring boot 2 valid";
    }
}