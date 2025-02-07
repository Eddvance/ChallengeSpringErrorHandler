package io.eddvance.practice.error_handling.service;

import io.eddvance.practice.error_handling.entity.Book;
import io.eddvance.practice.error_handling.exceptions.BookNotFoundException;
import io.eddvance.practice.error_handling.repository.BookRepositoryInterface;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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
    public Book getBookByNumber(Long number) {
        return bookRepositoryInterface.findById(number).orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
    }

    @Override
    public void deleteBook(Long id) {
        if (!bookRepositoryInterface.existsById(id)) {
            throw new BookNotFoundException("Book not found with id " + id);
        }
        bookRepositoryInterface.deleteById(id);
    }
}
