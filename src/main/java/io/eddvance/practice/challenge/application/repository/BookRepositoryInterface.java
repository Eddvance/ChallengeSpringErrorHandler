package io.eddvance.practice.challenge.application.repository;

import io.eddvance.practice.challenge.application.model.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositoryInterface extends CrudRepository<Book, Long> {
}
