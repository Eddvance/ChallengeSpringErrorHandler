package io.eddvance.practice.error_handling.api;

import io.eddvance.practice.error_handling.entity.Book;
import io.eddvance.practice.error_handling.service.BookServiceInterface;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookResource {

    private BookServiceInterface bookService;
    public BookResource(BookServiceInterface bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping
    public Iterable<Book> getBookList() {
        return bookService.getBookList();
    }

    @GetMapping("/{id}")
    public Book getBookByNumber(@PathVariable Long id) {
        return bookService.getBookByNumber(id);
    }
}