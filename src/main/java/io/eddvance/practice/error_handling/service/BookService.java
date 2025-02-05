package io.eddvance.practice.error_handling.service;

import io.eddvance.practice.error_handling.entity.Book;
import io.eddvance.practice.error_handling.repository.BookRepositoryInterface;
import org.springframework.stereotype.Service;

@Service
public class BookService implements BookServiceInterface {

    private final BookRepositoryInterface bookRepositoryInterface;
    public BookService(BookRepositoryInterface bookRepositoryInterface) {this.bookRepositoryInterface = bookRepositoryInterface;}

    @Override
    public Book createBook(Book book) {
        return bookRepositoryInterface.save(book);
    }

    @Override
    public Iterable<Book> getBookList() {
        return bookRepositoryInterface.findAll();
    }

    @Override
    public Book getBookByNumber(Long number) {
        return bookRepositoryInterface.findById(number).orElse(null);
    }
}
