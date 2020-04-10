package com.bootcamp.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.library.model.dto.BookDto;
import com.bootcamp.library.model.entity.Author;
import com.bootcamp.library.model.entity.Book;
import com.bootcamp.library.repository.BookRepository;
import com.bootcamp.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public void addBook(BookDto bookDto) {	
		Book book = new Book();
		book.setBarcode(bookDto.getBarcode());
		book.setTitle(bookDto.getTitle());
		
		Author author = new Author();
		author.setName(bookDto.getAuthorDto().getName());
		author.setLanguage(bookDto.getAuthorDto().getLanguage());
		author.setCountry(bookDto.getAuthorDto().getCountry());
		book.setAuthor(author);
		
		bookRepository.save(book);
	}

}
