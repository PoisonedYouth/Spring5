package com.poisonedyouth.spring5.repositories;

import com.poisonedyouth.spring5.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
