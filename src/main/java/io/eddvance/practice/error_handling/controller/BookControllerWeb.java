package io.eddvance.practice.error_handling.controller;

import io.eddvance.practice.error_handling.form.BookForm;
import io.eddvance.practice.error_handling.service.BookService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("book")
public class BookControllerWeb {

    private final BookService bookService;

    public BookControllerWeb(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("home")
    public String displayHome() {
        return "book-home";
    }

    @GetMapping("create-form")
    public String displayBookCreateForm() {
        return "book-create-form";
    }

}