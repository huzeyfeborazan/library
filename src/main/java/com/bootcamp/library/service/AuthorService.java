package com.bootcamp.library.service;

import java.util.List;

import com.bootcamp.library.model.dto.AuthorDto;
import com.bootcamp.library.model.entity.Author;

public interface AuthorService {
	
	public void addAuthor(AuthorDto authorDto);
	
	public List<AuthorDto> getAllAuthors();
	
	public List<Author> getAllAuthors2();

}
