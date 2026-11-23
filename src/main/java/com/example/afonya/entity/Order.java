package com.example.afonya.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;

// id SERIAL PRIMARY KEY,
// account_id INTEGER NOT NULL,
// order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
// total_amount DECIMAL(10, 2) NOT NULL,

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "account_id")
  private Long accountId;

  @CreationTimestamp
  @Column(name = "order_date", updatable = false)
  private LocalDateTime orderDate;

  @Column(name = "total_amount")
  private BigDecimal totalAmount;

}
