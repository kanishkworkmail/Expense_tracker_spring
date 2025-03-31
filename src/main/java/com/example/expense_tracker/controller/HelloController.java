package com.example.expense_tracker.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Expense Tracker!";
    }
}
