package io.eddvance.practice.error_handling.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BookForm {

    private Long number;
    @NotBlank
    private String name;

    @NotBlank
    @Size(min = 4, max = 4)
    private Long publicationYear;

    private String author;

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

    public Long getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Long publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }
}
