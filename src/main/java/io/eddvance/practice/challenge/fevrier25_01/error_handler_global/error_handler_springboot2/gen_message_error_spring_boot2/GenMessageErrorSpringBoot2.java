package io.eddvance.practice.challenge.fevrier25_01.error_handler_global.error_handler_springboot2.gen_message_error_spring_boot2;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@Profile("spring boot 2")
@RestControllerAdvice
public class GenMessageErrorSpringBoot2 {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllExceptions(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("errorMessage", e.getMessage());
        return modelAndView;
    }
}