package com.example.booksystem.repository;

import com.example.booksystem.data.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
