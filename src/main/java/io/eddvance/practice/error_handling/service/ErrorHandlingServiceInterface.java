package io.eddvance.practice.error_handling.service;

import io.eddvance.practice.error_handling.entity.Book;

public interface ErrorHandlingServiceInterface {
    Book createBook(Book book);
    Iterable<Book> getBookList();
    Book getBookByNumber(Long number);
}
