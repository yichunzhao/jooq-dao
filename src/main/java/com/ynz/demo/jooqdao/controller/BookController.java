package com.ynz.demo.jooqdao.controller;

import com.ynz.demo.jooqdao.model.tables.pojos.Book;
import com.ynz.demo.jooqdao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("books")
    public void createBook(@RequestBody Book book) {
        bookService.insertBook(book);
    }

}
