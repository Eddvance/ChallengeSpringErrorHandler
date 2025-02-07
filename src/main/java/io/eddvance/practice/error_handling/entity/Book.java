package io.eddvance.practice.error_handling.entity;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_NUMBER", columnDefinition = "BIGINT")
    private Long BookNumber;

    @Column(name = "BOOK_NAME")
    private String name;

    public Long getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Long publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Column(name = "PUBLICATION_YEAR")
    private Long publicationYear;

    @Column(name = "BOOK_AUTHOR", updatable = false)
    private String author = "Eddvance";

    //private Chapter chapter;
    //private Line line;

    public Book() {
    }

   /* public Book(Long bookNumber, String name, Long publicationYear, String author) {
        BookNumber = bookNumber;
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }
*/
    public Book(String author) {
        this.author = author;
    }

    public Long getBookNumber() {
        return BookNumber;
    }

    public void setBookNumber(Long number) {
        this.BookNumber = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

}