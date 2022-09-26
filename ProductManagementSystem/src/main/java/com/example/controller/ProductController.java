package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.services.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@PostMapping("/addProduct")
	public Integer addProduct(@RequestBody Product product) {
		Integer addProduct = productService.addProduct(product);
		System.err.println(addProduct);
		return addProduct;
		
	}
	
	@GetMapping("/ping")
	public void ping() {
		System.out.println("Hi This is Sai");
	}

}
