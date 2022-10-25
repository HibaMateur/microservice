package com.esprit.microservices.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.esprit.microservices.Repo.BookRepo;
import com.esprit.microservices.entity.Book;

@Service

public class BookServices {

	@Autowired
	private BookRepo bookrepo;

	public Book saveBook(@RequestBody Book book) {
		return bookrepo.save(book);
	}

	public Book getbyidnow(Long idbook) {
		System.out.println("saved");
		return bookrepo.findById(idbook).orElse(null);
	}

}
