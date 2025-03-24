package com.delivery.books.controller;

import com.delivery.books.entity.BookEntity;
import com.delivery.books.service.BookServise;
import com.delivery.books.service.impl.BookServiseImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${application.endpoint.root}")
public class BookController {
    private final BookServise service;

    public BookController(BookServiseImpl bookServise) {
        this.service = bookServise;
    }

    @GetMapping("${application.endpoint.test}")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("${application.endpoint.books.all}")
    public List<BookEntity> all() {
        return service.readAll();
    }
}
