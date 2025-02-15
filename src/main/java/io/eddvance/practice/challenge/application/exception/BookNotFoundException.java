package io.eddvance.practice.challenge.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BookNotFoundException extends ResponseStatusException {
    public BookNotFoundException(String id) {
        super(HttpStatus.NOT_FOUND, "Book avec ID " + id + " non trouvé");
    }
}