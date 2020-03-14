package com.cts.bcs.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bcs.beans.Book;

@RestController
@RequestMapping("/info")
public class BookInfoController {

		@RequestMapping("/all")
		List<Book> getAllBooks() {
			return Arrays.asList(
					new Book("Three mistakes of my life", "True story who shares to the author","Chetan Bhagat", 4),
					new Book("Happy Life", "A Book about Change","Gaur Gopal Das", 5),
					new Book("The girl in room 501", "True incident","Chetan Bhagat", 4)
					);
		}
		
	}



