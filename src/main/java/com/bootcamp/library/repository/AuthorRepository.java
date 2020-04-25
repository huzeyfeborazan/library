package com.bootcamp.library.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bootcamp.library.model.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
	
	List<Author> getAllAuthorByAlive(Boolean alive);
	
	//JPQL
	@Query("SELECT a FROM Author a WHERE a.alive = 1")
	List<Author> findAllAuthorsSorted(Sort sortByName);
	
	//JPQL
	@Query("SELECT a FROM Author a WHERE a.alive = ?1 and a.country = ?2")
	List<Author> findAllAuthorsParameter(Boolean alive, String country);
	
	//JPQL
	@Query("SELECT a FROM Author a WHERE a.alive = :dead and a.country = :countryName")
	List<Author> findAllAuthorsNamedParameter(@Param("dead") Boolean alive, @Param("countryName") String country);
	
	//Native
	@Query(value = "SELECT * FROM \"author\" WHERE \"alive\" = TRUE",
			nativeQuery = true)
	List<Author> getAllAliveAuthorsNative();
	
}
