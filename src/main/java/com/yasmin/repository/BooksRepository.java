package com.yasmin.repository;

import com.yasmin.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
