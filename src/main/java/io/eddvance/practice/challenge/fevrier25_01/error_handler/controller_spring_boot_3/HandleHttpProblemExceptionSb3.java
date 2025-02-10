package io.eddvance.practice.challenge.fevrier25_01.error_handler.controller_spring_boot_3;

import io.eddvance.practice.challenge.fevrier25_01.error_handler.error_handler_exception.MyGlobalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class HandleHttpProblemExceptionSb3 {

    @ExceptionHandler(MyGlobalException.class)
    public ProblemDetail handleMyCustomException(MyGlobalException my) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        problemDetail.setTitle("Erreur Spring Boot 3");
        problemDetail.setDetail(my.getMessage());
        problemDetail.setProperty("myCustomProp", "valeur perso");
        return problemDetail;
    }
}