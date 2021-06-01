package com.ynz.demo.jooqdao.service;

import com.ynz.demo.jooqdao.model.Tables;
import com.ynz.demo.jooqdao.model.tables.pojos.Book;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private DSLContext dslContext;

    public BookService(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<Book> getBooks() {
        return dslContext.selectFrom(Tables.BOOK).fetchInto(Book.class);
    }

    public void insertBook(Book book) {
        dslContext.insertInto(Tables.BOOK, Tables.BOOK.AUTHOR, Tables.BOOK.TITLE).values(book.getAuthor(), book.getTitle()).execute();
    }

}
