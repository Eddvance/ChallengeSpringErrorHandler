package io.eddvance.practice.error_handling.repository;

import io.eddvance.practice.error_handling.entity.Book;
import org.springframework.data.repository.CrudRepository;

public class ErrorHandlingRepositoryInterface extends CrudRepository<Book,Long> {
}
