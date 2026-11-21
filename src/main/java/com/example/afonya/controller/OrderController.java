package com.example.afonya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

  @PostMapping("/purchase")
  public String purchase(@RequestBody String entity) {
    // TODO: process purchase
    return entity;
  }

  @GetMapping("/find")
  public String findOrder(@RequestParam String param) {
    // TODO find order from db
    return "lol";
  }

  @PostMapping("/prepareForAudition")
  public String dropOrders(@RequestBody String entity) {
    // TODO: process deleting orders

    return entity;
  }
}
