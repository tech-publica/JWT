package com.example.springsecdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	@GetMapping("hello")
	public String greet() {
		return "Hello World ";
	}
	
	@GetMapping("about")
	public String about(HttpServletRequest request) {
		return "JWT Example "+request.getSession().getId();
	}
}
