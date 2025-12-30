package com.devops.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>🚀 DevOps Static Java App</h1>" +
               "<p>Successfully deployed using Docker & GitHub Actions</p>";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
