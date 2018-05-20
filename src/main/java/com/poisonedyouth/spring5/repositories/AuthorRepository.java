package com.poisonedyouth.spring5.repositories;

import com.poisonedyouth.spring5.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
