package io.eddvance.practice.challenge.application.controller.controller_web;

import io.eddvance.practice.challenge.application.model.entity.Book;
import io.eddvance.practice.challenge.application.service.BookServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/book-create")
    public String displayBookCreateForm(Model model) {
        model.addAttribute("bookForm", new Book());
        return "book-create";
    }

    @PostMapping("/create")
    public String createBook(@ModelAttribute("bookForm") Book book, Model model) {
        Book createdBook = bookService.createBook(book);
        model.addAttribute("book", createdBook);
        return "book-created";
    }
}