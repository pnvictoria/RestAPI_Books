package com.delivery.books.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "reservations",
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "book_id"}) // Один користувач може забронювати книгу один раз
)
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @ManyToOne
    private  UserEntity user;
    @ManyToOne
    private BookEntity book;
    private LocalDateTime reservedAt = LocalDateTime.now();
    @ManyToOne
    private ReservationStatusEntity status;
}
