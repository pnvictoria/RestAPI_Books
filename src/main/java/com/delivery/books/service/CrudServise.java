package com.delivery.books.service;

import com.delivery.books.entity.BookEntity;

import java.util.List;

public interface CrudServise {
    BookEntity create(BookEntity book);
    BookEntity read(String id);
    List<BookEntity> readAll();
    BookEntity update(BookEntity book);
    void delete(BookEntity book);
}
