package io.eddvance.practice.error_handling.entity;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_NUMBER", columnDefinition = "BIGINT")
    private Long number;

    @Column(name = "BOOK_NAME")
    private String name;

    @Column(name = "PUBLICATION_YEAR")
    private Long publicationYear;

    @Column(name = "BOOK_AUTHOR", updatable = false)
    private String author = "Edouard Leroy";

    //private Chapter chapter;
    //private Line line;

    public Book() {
    }

    public Book(String author) {
        this.author = author;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
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

    public Book(Long number, String name) {
        this.number = number;
        this.name = name;
    }

}
