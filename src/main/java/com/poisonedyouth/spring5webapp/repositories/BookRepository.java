package com.poisonedyouth.spring5webapp.repositories;

import com.poisonedyouth.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by poisonedyouth on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
