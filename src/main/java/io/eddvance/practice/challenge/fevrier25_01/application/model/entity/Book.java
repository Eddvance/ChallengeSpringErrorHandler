package io.eddvance.practice.challenge.fevrier25_01.application.model.entity;

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

    @Column(name = "BOOK_DESCRIPTION", length = 5000)
    private String bookDescription;

    @Column(name = "BOOK_AUTHOR", updatable = false)
    private String bookAuthor = "Eddvance";

    public Book() {
    }

    public Book(Long bookNumber, String bookName, Long bookPublicationYear, String bookDescription, String bookAuthor) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.bookPublicationYear = bookPublicationYear;
        this.bookDescription = bookDescription;
        this.bookAuthor = bookAuthor;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
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