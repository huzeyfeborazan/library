package com.bootcamp.library.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.library.model.entity.Book;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {
	
	public List<Book> findBookByTitleOrderByTitleDesc(String title);

}
