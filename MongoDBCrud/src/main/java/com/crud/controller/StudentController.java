package com.crud.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.repo.IStudentRepo;

@RestController
public class StudentController {

	@Autowired
	private IStudentRepo studentRepo;
	
	@PostMapping("addstudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student save = this.studentRepo.save(student);
		return ResponseEntity.ok(save);
	}

	@GetMapping("/getstudent")
	public ResponseEntity<?> studentInfo() {
		return ResponseEntity.ok(this.studentRepo.findAll());
		
	}
	
	@PutMapping("/update{id}")
	public ResponseEntity<Student> updateInfo(@PathParam("id")  int id,@RequestBody Student student ){
		Student insert = this.studentRepo.save(student);
		return ResponseEntity.ok(insert);
		
	}
}
