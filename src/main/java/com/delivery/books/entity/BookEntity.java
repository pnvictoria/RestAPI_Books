package com.delivery.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BookEntity {
    @Id
    private BigInteger id;
    private String title;
    private String author;
    private String auth;
    @ManyToOne
    private GenreEntity genreId;
    private Integer publishedYear;
    private boolean available;
    private LocalDateTime createdAt;
}
