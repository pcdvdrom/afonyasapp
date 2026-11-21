package com.example.afonya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/account")
public class AccountController {

  @PostMapping("/register")
  public String purchase(@RequestBody String entity) {
    // TODO: process creating new user
    return entity;
  }
}
