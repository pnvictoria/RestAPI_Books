package com.delivery.books.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Entity
@Table(name = "genres")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private String name;
}
