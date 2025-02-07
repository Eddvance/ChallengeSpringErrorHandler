package io.eddvance.practice.error_handling.controller;

import io.eddvance.practice.error_handling.entity.Book;
import io.eddvance.practice.error_handling.service.BookServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookControllerWeb {

    private final BookServiceInterface bookService;
    public BookControllerWeb(BookServiceInterface bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/home")
    public String displayHome(Model model) {
        model.addAttribute("books", bookService.getBookList());
        return "book-home";
    }

    @GetMapping("/create-form")
    public String displayBookCreateForm(Model model) {
        model.addAttribute("bookForm", new Book());
        return "book-create-form";
    }

    @PostMapping("/create")
    public String createBook(@ModelAttribute("bookForm") Book book) {
        bookService.createBook(book);
        return "redirect:/home";
    }
}