package com.example.afonya.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

// id SERIAL PRIMARY KEY,
// username VARCHAR(100)
// email VARCHAR(255) NOT NULL UNIQUE,
// created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "username", length = 100)
  private String username;

  @Column(name = "email", nullable = false, length = 255)
  private String email;

  @CreationTimestamp
  @Column(name = "created_at", updatable = false)
  private LocalDateTime createdAt;

  protected Account() {
  }

  public Account(String username, String email) {
    this.username = username;
    this.email = email;
  }
}
