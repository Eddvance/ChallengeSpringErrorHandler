package io.eddvance.practice.challenge.application.service;

import io.eddvance.practice.challenge.application.exception.BookNotFoundException;
import io.eddvance.practice.challenge.application.model.entity.Book;
import io.eddvance.practice.challenge.application.repository.BookRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookServiceInterface {

    private final BookRepositoryInterface bookRepositoryInterface;

    public BookService(BookRepositoryInterface bookRepositoryInterface) {
        this.bookRepositoryInterface = bookRepositoryInterface;
    }

    @Override
    public Book createBook(Book book) {
        return bookRepositoryInterface.save(book);
    }

    @Override
    public Iterable<Book> getBookList() {
        return bookRepositoryInterface.findAll();
    }

    @Override
    public Book getBookByNumber(Long id) {
        return bookRepositoryInterface.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
    }

    @Override
    public void deleteBook(Long id) {
        if (!bookRepositoryInterface.existsById(id)) {
            throw new BookNotFoundException("Book not found with id " + id);
        }
        bookRepositoryInterface.deleteById(id);
    }

    @Override
    public void deleteAllBooks(List<Long> ids) {
        bookRepositoryInterface.deleteAll();
    }
}