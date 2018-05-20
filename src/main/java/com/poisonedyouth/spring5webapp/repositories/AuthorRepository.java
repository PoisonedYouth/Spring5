package com.poisonedyouth.spring5webapp.repositories;

import com.poisonedyouth.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by poisonedyouth on 5/16/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
