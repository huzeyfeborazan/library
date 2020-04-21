package com.bootcamp.library.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.library.model.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	
	public List<Book> findBookByTitleOrderByTitleDesc(String asdasdasdadasdas);
	
}
