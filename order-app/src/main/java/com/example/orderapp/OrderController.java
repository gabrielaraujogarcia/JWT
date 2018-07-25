package com.example.orderapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(Arrays.asList("Pedido 1","Pedido 2","Pedido 3"));
    }

}
