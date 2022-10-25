package com.esprit.microservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservices.Services.BookServices;
import com.esprit.microservices.entity.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookServices bookservices;
	
	
	@PostMapping("/add")

	public Book saveBook(@RequestBody Book book)
	{
		
		return bookservices.saveBook(book);
	}
	@GetMapping("/{id}")
	public Book findBook(@PathVariable("id") Long idbook)
	{
		return bookservices.getbyidnow(idbook);
	}
}
