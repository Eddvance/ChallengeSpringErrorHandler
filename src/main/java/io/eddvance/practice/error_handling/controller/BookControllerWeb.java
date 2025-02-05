package io.eddvance.practice.error_handling.controller;

import io.eddvance.practice.error_handling.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookControllerWeb {

    private final BookService errorHandlingService;
    public BookControllerWeb(BookService errorHandlingService) {
        this.errorHandlingService = errorHandlingService;
    }

    @PostMapping(/"create")
    public String createBook(@Valid @ModelAttribute ) {}
}
