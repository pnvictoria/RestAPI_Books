package com.delivery.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "reservation_status")
public class ReservationStatusEntity {
    @Id
    private BigInteger id;
    private String status;

}
