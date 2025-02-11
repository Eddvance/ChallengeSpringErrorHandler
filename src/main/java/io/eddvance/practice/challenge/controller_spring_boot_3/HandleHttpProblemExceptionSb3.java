package io.eddvance.practice.challenge.controller_spring_boot_3;

import io.eddvance.practice.challenge.error_handler_exception.MyGlobalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleHttpProblemExceptionSb3 {

    @ExceptionHandler(MyGlobalException.class)
    public ProblemDetail handleMyCustomException(MyGlobalException my) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST.value());
        problemDetail.setTitle("Spring Boot 3 error");
        problemDetail.setDetail(my.getMessage());
        problemDetail.setProperty("myCustomProp", "My globalException");
        return problemDetail;
    }
}