package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {
	
	@GetMapping("/welcome")
	public String getTestMsg() {
		String message = "Hi This is Sai";
		
		System.out.println(message);
		
		return message;
	}

}
