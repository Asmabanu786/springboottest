package com.cts.bcs.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.bcs.beans.BookCatalogItem;
import com.cts.bcs.service.BookService;

@RestController
@RequestMapping("/books")

public class BookCatalogController {

	
	@Autowired
	BookService service;

	@RequestMapping("/item")
	BookCatalogItem getBook() {
		return service.getBook();
	}
	
	@RequestMapping("/all")
	List<Object> getAllBooks() {
			return service.getAllBooks();
	}
	
	
}	



