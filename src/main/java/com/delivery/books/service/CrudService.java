package com.delivery.books.service;

import java.util.List;

public interface CrudService<T, G> {
    T create(T entity);
    T read(G id);
    List<T> readAll();
    T update(T entity);
    void delete(T entity);
}
