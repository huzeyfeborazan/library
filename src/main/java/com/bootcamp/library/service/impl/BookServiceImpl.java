package com.bootcamp.library.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
		
		bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks2(Integer page, Integer count) {
		
		List<Book> bookList = new ArrayList<Book>();
		
		Sort sortByTitleAscAndBarcodeDesc = Sort.by("title").ascending().and(Sort.by("barcode").descending());
		Pageable pageRequest = PageRequest.of(page, count, sortByTitleAscAndBarcodeDesc);
		
		bookRepository.findAll(pageRequest).forEach(book -> {
			bookList.add(book);
		});

		return bookList;
	}

}
