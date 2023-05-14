package com.ecommerce.paymentService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TRANSACTION_DETAILS")
public class TransactionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "PAYMENT_MODE")
    private String paymentMode;

    @Column(name = "REFERENCE_NUMBER")
    private String referenceNumber;

    @Column(name = "PAYMENT_DATE")
    private Instant paymentDate;

    @Column(name = "STATUS")
    private String paymentStatus;

    @Column(name = "AMOUNT")
    private long amount;
}
