package com.bootcamp.library.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.library.model.dto.AuthorDto;
import com.bootcamp.library.model.entity.Author;
import com.bootcamp.library.repository.AuthorRepository;
import com.bootcamp.library.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	
	@Override
	public void addAuthor(AuthorDto authorDto) {
		Author author = new Author();
		author.setName(authorDto.getName());
		author.setCountry(authorDto.getCountry());
		author.setLanguage(authorDto.getLanguage());
		
		authorRepository.save(author);
	}

	@Override
	public List<AuthorDto> getAllAuthors() {
		List<AuthorDto> authorDtoList = new ArrayList<AuthorDto>();
		authorRepository.findAll().forEach(author -> {
			authorDtoList.add(convertAuthor(author));
		});
		return authorDtoList;
	}
	
	private AuthorDto convertAuthor(Author author) {
		AuthorDto authorDto = new AuthorDto();
		authorDto.setCountry(author.getCountry());
		authorDto.setLanguage(author.getLanguage());
		authorDto.setName(author.getName());
		return authorDto;
	}

}
