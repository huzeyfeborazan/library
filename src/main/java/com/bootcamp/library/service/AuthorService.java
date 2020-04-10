package com.bootcamp.library.service;

import java.util.List;

import com.bootcamp.library.model.dto.AuthorDto;

public interface AuthorService {
	
	public void addAuthor(AuthorDto authorDto);
	
	public List<AuthorDto> getAllAuthors();

}
