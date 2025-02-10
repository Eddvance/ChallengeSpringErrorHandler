package io.eddvance.practice.challenge.fevrier25_01.application.service;

import io.eddvance.practice.challenge.fevrier25_01.application.model.entity.Book;

import java.util.List;

public interface BookServiceInterface {
    Book createBook(Book book);
    Iterable<Book> getBookList();
    Book getBookByNumber(Long number);
    void deleteBook(Long id);
    void deleteAllBooks(List<Long> ids);
}
