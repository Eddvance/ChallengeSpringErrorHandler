package io.eddvance.practice.challenge.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BookNotFoundException extends ResponseStatusException {

    public BookNotFoundException(Long id) {
        super(HttpStatus.NOT_FOUND, "Book avec ID " + id + " non trouvé");
    }

    public BookNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
}