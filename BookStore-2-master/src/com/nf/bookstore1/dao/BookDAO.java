package com.nf.bookstore1.dao;

import com.nf.bookstore1.entity.Book;

import java.util.List;

public interface BookDAO {
    List<Book> listAll();
    Book getBookById(int id);
    List<Book> getBooksByName(String name);
    boolean update(Book book);
    boolean delete(int id);
    Book add(Book book);
}
