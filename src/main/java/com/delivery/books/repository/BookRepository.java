package com.delivery.books.repository;

import com.delivery.books.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, BigInteger> {
}
