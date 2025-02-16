package io.eddvance.practice.challenge.application.controller.api;

import io.eddvance.practice.challenge.application.exception.BookNotFoundException;
import io.eddvance.practice.challenge.application.model.entity.Book;
import io.eddvance.practice.challenge.application.service.BookServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookResource {

    private final BookServiceInterface bookService;

    public BookResource(BookServiceInterface bookService) {
        this.bookService = bookService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping(produces = "application/json")
    public Iterable<Book> getBookList() {
        return bookService.getBookList();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Book getBookByNumber(@PathVariable Long id) {
        return bookService.getBookByNumber(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable("id") Long number) {
        bookService.deleteBook(number);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/bulk-delete")
    public ResponseEntity<Void> deleteBooks(@RequestBody List<Long> ids) {
        bookService.deleteAllBooks(ids);
        return ResponseEntity.noContent().build();
    }
}