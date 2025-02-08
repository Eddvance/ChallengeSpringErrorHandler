package io.eddvance.practice.error_handling.service;

import io.eddvance.practice.error_handling.entity.Book;

import java.util.List;

public interface BookServiceInterface {
    Book createBook(Book book);
    Iterable<Book> getBookList();
    Book getBookByNumber(Long number);
    void deleteBook(Long id);
    void deleteAllBooks(List<Long> ids);
}
