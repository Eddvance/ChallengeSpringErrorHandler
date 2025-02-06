package io.eddvance.practice.error_handling.controller;

import io.eddvance.practice.error_handling.entity.Book;
import io.eddvance.practice.error_handling.form.BookForm;
import io.eddvance.practice.error_handling.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("book")
public class BookControllerWeb {

    private final BookService errorHandlingService;
    public BookControllerWeb(BookService bookService) {
        this.errorHandlingService = bookService;
    }

    @GetMapping("home")
    public String displayHome() {
        return "book-home";
    }

    @GetMapping("create-form")
    public String displayBookCreateForm() {
        return "book-create-form";
    }

    @PostMapping("create")
    public String createBook(Model model, BookForm bookForm) {
        //Book book = new Book();
        //book.setName(bookForm.getName());
        model.addAttribute("bookForm", new BookForm());
        return "book-created";
    }

    @GetMapping("test")
    public String test() {
        return "test"; // Doit afficher un fichier "test.html"
    }
}
