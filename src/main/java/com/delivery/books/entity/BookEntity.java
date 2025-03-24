package com.delivery.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    private String isbn;
    private String name;
    private String auth;

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuth() {
        return auth;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", auth='" + auth + '\'' +
                '}';
    }
}
