package com.example.orderapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class OrderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderAppApplication.class, args);
	}

	@GetMapping(path = "/logout")
	public ResponseEntity<?> logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return ResponseEntity.ok().build();
	}

}
