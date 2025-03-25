package com.delivery.books.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "reading_history",
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "book_id"})
)
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ReadingHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @ManyToOne
    private UserEntity user;
    @ManyToOne
    private BookEntity book;
    private LocalDateTime takenAt = LocalDateTime.now();
    private LocalDateTime returnedAt;
}
