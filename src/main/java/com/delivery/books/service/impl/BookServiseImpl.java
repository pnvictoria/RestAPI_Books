package com.delivery.books.service.impl;

import com.delivery.books.entity.BookEntity;
import com.delivery.books.repository.BookRepository;
import com.delivery.books.service.BookServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiseImpl implements BookServise {
    private final BookRepository repository;

    @Autowired
    BookServiseImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public BookEntity create(BookEntity book) {
        return repository.save(book);
    }

    @Override
    public BookEntity read(String id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<BookEntity> readAll() {
        return repository.findAll();
    }

    @Override
    public BookEntity update(BookEntity book) {
        return null;
    }

    @Override
    public void delete(BookEntity book) {
        repository.delete(book);
    }
}
