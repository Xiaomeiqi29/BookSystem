package com.example.booksystem.controller;

import com.example.booksystem.data.Book;
import com.example.booksystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBookById(@PathVariable String id) {
        bookService.deleteBookById(id);
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    @GetMapping()
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
