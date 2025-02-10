package io.eddvance.practice.challenge.fevrier25_01.application.repository;

import io.eddvance.practice.challenge.fevrier25_01.application.model.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositoryInterface extends CrudRepository<Book, Long> {
}
