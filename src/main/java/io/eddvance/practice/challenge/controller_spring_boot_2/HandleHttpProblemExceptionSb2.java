package io.eddvance.practice.challenge.controller_spring_boot_2;

import io.eddvance.practice.challenge.error_handler_exception.MyGlobalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleHttpProblemExceptionSb2 {
    @ExceptionHandler(MyGlobalException.class)
    public ResponseEntity<GenMessageErrorSpringBoot2> handleCustomException(MyGlobalException my) {
        GenMessageErrorSpringBoot2 errorResponse = new GenMessageErrorSpringBoot2(
                HttpStatus.BAD_REQUEST.value(),
                my.getMessage(),
                "Plus de détails si nécessaire"
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}