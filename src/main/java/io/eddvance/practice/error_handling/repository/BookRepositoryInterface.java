package io.eddvance.practice.error_handling.repository;

import io.eddvance.practice.error_handling.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositoryInterface extends CrudRepository<Book, Long> {
}
