package io.eddvance.practice.error_handling.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BookForm {

    private Long bookNumber;
    @NotBlank
    private String bookName;

    @NotBlank
    @Size(min = 4, max = 4)
    private Long bookPublicationYear;

    @NotBlank
    private String bookDescription;

    private String bookAuthor;

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
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

    public Long getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(Long bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}