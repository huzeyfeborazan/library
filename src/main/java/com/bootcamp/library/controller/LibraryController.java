package com.bootcamp.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.library.model.dto.AuthorDto;
import com.bootcamp.library.model.dto.BookDto;
import com.bootcamp.library.model.entity.Author;
import com.bootcamp.library.model.entity.Book;
import com.bootcamp.library.service.AuthorService;
import com.bootcamp.library.service.BookService;

@RestController
public class LibraryController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public String addBook(@RequestBody BookDto bookDto) {
		bookService.addBook(bookDto);
		return "OK";
	}
	
	@RequestMapping(value = "/author", method = RequestMethod.POST)
	public String addAuthor(@RequestBody AuthorDto authorDto) {	
		authorService.addAuthor(authorDto);	
		return "OK";	
	}
	
	@RequestMapping(value = "/author/all", method = RequestMethod.GET)
	public List<AuthorDto> getAllAuthors() {
		return authorService.getAllAuthors();
	}
	
	@RequestMapping(value = "/author/all/2", method = RequestMethod.GET)
	public List<Author> getAllAuthors2() {
		return authorService.getAllAuthors2();
	}
	
	@RequestMapping(value = "/book/all/2", method = RequestMethod.GET)
	public List<Book> getAllBooks2() {
		return bookService.getAllBooks2();
	}

}
