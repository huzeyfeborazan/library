package com.bootcamp.library.service;

import java.util.List;

import com.bootcamp.library.model.dto.BookDto;
import com.bootcamp.library.model.entity.Book;

public interface BookService {
	
	public void addBook(BookDto bookDto);
	
	public List<Book> getAllBooks2(Integer page, Integer count);

}
