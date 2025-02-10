package io.eddvance.practice.challenge.fevrier25_01.error_handler_global.error_handler_springboot3.problem_detail_spring_boot_3;

import io.eddvance.practice.challenge.fevrier25_01.error_handler_global.error_handling_exceptions.HandleHttpProblemExceptionSb2;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;

@Profile("Spring boot 3")
@RestControllerAdvice
public class ProblemDetailSpringBoot3 {

    @ExceptionHandler(HandleHttpProblemExceptionSb2.class)
    public ResponseEntity<ProblemDetail> handException(Exception h) {
        ProblemDetail problemDetail= ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, h.getMessage());
                problemDetail.setTitle("Internal Server Error - (Spring Boot 3)");
                problemDetail.setType(URI.create("http://localhost:803/springboot3/rfc7807/problem-detail"));
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);
    }
}