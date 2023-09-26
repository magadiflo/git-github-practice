package com.magadiflo.git.github.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/products")
public class ProductController {
    @GetMapping
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok("Hello");
    }
}
