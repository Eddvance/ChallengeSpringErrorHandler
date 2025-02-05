package io.eddvance.practice.error_handling.form;

import jakarta.validation.constraints.NotBlank;

public class BookForm {

    private Long number;
    @NotBlank
    private String name;
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

    public String getAuthor() {
        return author;
    }
}
