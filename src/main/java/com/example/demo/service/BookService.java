package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.Optional;

public interface BookService {
    Optional<Book> findById(Integer id);
    Iterable<Book> findAll();
    Book save(Book book);
    void delete(Integer id);
}
