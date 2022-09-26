package com.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getstudentdetail/{schoolname}")
	public String getStudents(@PathVariable String schoolname) {
		//String url = "http://Student-Service/student/" + schoolname;
		String response = restTemplate.exchange("http://Student-Service/student/{schoolname}", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				}, schoolname).getBody();

		return "School Name  " + schoolname + " Student detail" + response;
	}

}
