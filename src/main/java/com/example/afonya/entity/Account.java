package com.example.afonya.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public Long getId() {
    return id;
  }

  @Column(name = "username", length = 100)
  private String username;

  public String getUsername() {
    return username;
  }

  @Column(name = "email", nullable = false, length = 255)
  private String email;

  public String getEmail() {
    return email;
  }

  @CreationTimestamp
  @Column(name = "created_at", updatable = false)
  private LocalDateTime createdAt;

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
  private List<Order> orders = new ArrayList<>();

  public List<Order> getOrders() {
    return orders;
  }

  protected Account() {
  }

  public Account(String username, String email) {
    this.username = username;
    this.email = email;
  }
}
