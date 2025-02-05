package io.eddvance.practice.error_handling.repository;

import io.eddvance.practice.error_handling.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Repository
public class ErrorHandlingRepository implements CrudRepository<Book, Long> {

private Logger logger = Logger.getLogger(ErrorHandlingRepository.class.getName());
private static List<Book> books = new ArrayList<>();

    @Override
    public  Book save(Book book) {
        books.add(book);
        logger.info("Book saved: " + book);
        return book;
    }

    @Override
    public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Book> findById(Long aLong) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(Long aLong) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Book> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Book> findAllById(Iterable<Long> longs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Book entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Book> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
