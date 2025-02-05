package io.eddvance.practice.error_handling.service;

import io.eddvance.practice.error_handling.entity.Book;

public interface BookServiceInterface {
    Book createBook(Book book);
    Iterable<Book> getBookList();
    Book getBookByNumber(Long number);
}
