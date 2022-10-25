package com.esprit.microservices.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.microservices.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {


}
