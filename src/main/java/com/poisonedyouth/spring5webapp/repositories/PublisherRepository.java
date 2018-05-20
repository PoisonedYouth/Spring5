package com.poisonedyouth.spring5webapp.repositories;

import com.poisonedyouth.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by poisonedyouth on 5/17/17.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
