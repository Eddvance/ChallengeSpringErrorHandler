package io.eddvance.practice.challenge.fevrier25_01.error_handler.controller_spring_boot_2;

import io.eddvance.practice.challenge.fevrier25_01.error_handler.error_handler_exception.MyGlobalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleHttpProblemExceptionSb2 {
    @ExceptionHandler(MyGlobalException.class)
    public ResponseEntity<GenMessageErrorSpringBoot2> handleCustomException(MatchException my) {
        GenMessageErrorSpringBoot2 errorResponse = new GenMessageErrorSpringBoot2(
                400,
                my.getMessage(),
                "Plus de détails si nécessaire"
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}