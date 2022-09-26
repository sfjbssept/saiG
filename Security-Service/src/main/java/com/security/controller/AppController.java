package com.security.controller;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.Employee;

@RestController
public class AppController {

	@GetMapping("/get")
	public String getEmplyees() {
		return "employees";
	}
	
	@PostMapping("/post")
	public Employee postMapping(@RequestBody Employee emp) {
		return emp;
	}
	
	@PutMapping("/put/{name}")
	public String putMapping(@RequestBody Employee emp,@PathVariable String name) {
		return emp.toString()+" updated with name "+ name;
		
	}
	@DeleteMapping("/delete/{name}")
	public String deleteMapping(@PathVariable String name) {
		return name;
	}
	@GetMapping("/get/{name}")
	public String getPathVar(@PathVariable("name")  String name) {
		return "Path Variable "+name;
	}
	
	@GetMapping("/request")
	public String getRequest(@RequestParam(name="name",required = true,defaultValue = "sai") String name) {
		return " request param "+name;
	}
	@GetMapping("/request/param")
	public String getRequestParam(@RequestParam List<String> id) {
		return "giving ids"+id;
	}
	@GetMapping("/header")
	public ResponseEntity<String> getRequestHeader(@RequestParam HttpHeaders header){
		if(!isHeaderMissing(header,"name")){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
			
		}
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.setExpires(ZonedDateTime.now().plusDays(1));
		String response = "valid header";
		return ResponseEntity.ok().headers(httpHeader).body(response);
	}

	private boolean isHeaderMissing(final HttpHeaders header,final  String headerKey) {
		if(header.containsKey(headerKey))
			return true;
		else {
		return false;
		}
	}
		
}
