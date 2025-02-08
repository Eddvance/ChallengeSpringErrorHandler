package io.eddvance.practice.error_handling.entity;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_NUMBER", columnDefinition = "BIGINT")
    private Long bookNumber;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "BOOK_PUBLICATION_YEAR")
    private Long bookPublicationYear;

    @Column(name = "BOOK_AUTHOR", updatable = false)
    private String bookAuthor = "Eddvance";

    //private Chapter chapter;
    //private Line line;

    public Book() {
    }

    public Book(Long bookNumber, String bookName, Long bookPublicationYear, String bookAuthor) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.bookPublicationYear = bookPublicationYear;
        this.bookAuthor = bookAuthor;
    }

    public Long getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(Long bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

    public Book(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Long getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Long bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}