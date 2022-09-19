package com.school.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/schooldetail")
public class SchoolServiceController {
	
	@Autowired
	RestTemplate resetTemplate;
	
	@GetMapping("/getstudent/{schoolname}")
	public String getStudent(@PathVariable String schoolname) {
		String url = "http://localhost:9091/student/"+schoolname;
		HttpHeaders http = new HttpHeaders();
		HttpEntity<String> httpEntity = new HttpEntity<String>(http);
		ResponseEntity<String> response = resetTemplate.exchange(url, HttpMethod.GET, httpEntity,String.class);
		String student = response.getBody();
		System.out.println(" The student is "+ student);
		
		return "School Name "+schoolname +" The student details "+student;
		
	}

}
