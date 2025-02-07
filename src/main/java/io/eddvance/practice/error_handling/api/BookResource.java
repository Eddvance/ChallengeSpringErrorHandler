package io.eddvance.practice.error_handling.api;

import io.eddvance.practice.error_handling.entity.Book;
import io.eddvance.practice.error_handling.service.BookServiceInterface;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookResource {

    private final BookServiceInterface bookService;

    public BookResource(BookServiceInterface bookService) {
        this.bookService = bookService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Book> getBookList() {
        return bookService.getBookList();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookByNumber(@PathVariable Long id) {
        return bookService.getBookByNumber(id);
    }
}