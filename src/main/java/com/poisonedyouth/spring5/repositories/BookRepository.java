package com.poisonedyouth.spring5.repositories;

import com.poisonedyouth.spring5.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
