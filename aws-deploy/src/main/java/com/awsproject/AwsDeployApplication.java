package com.awsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDeployApplication.class, args);
	}

	@GetMapping("/hi")
	public String  wishMe() {
		return "Hi Sai!, Good Morning";
		
	}
}
