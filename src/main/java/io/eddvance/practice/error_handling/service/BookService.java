package io.eddvance.practice.error_handling.service;

import io.eddvance.practice.error_handling.entity.Book;
import io.eddvance.practice.error_handling.repository.BookRepositoryInterface;
import org.springframework.stereotype.Service;

@Service
public class BookService implements BookServiceInterface {

    private final BookRepositoryInterface errorHandlingRepository;
    public BookService(BookRepositoryInterface errorHandlingRepository) {this.errorHandlingRepository = errorHandlingRepository;}

    @Override
    public Book createBook(Book book) {
        return errorHandlingRepository.save(book);
    }

    @Override
    public Iterable<Book> getBookList() {
        return errorHandlingRepository.findAll();
    }

    @Override
    public Book getBookByNumber(Long number) {
        return errorHandlingRepository.findById(number).orElse(null);
    }
}
