package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/users")
    public String users() {
        return "/users";
    }
}
