package com.bootcamp.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.bootcamp.library.model.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
