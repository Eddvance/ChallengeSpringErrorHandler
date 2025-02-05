package io.eddvance.practice.error_handling.core.entity;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_NUMBER", columnDefinition = "BIGINT")
    private Long number;
    @Column(name = "BOOK_NAME")
    private String name;
    @Column(name = "BOOK_AUTHOR")
    private final String author = "Edouard Leroy";

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

    public Book() {
    }

    public Book(Long number, String name, String author) {
        this.number = number;
        this.name = name;
    }


    //private Chapter chapter;
    //private Line line;

}
