package com.student.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.app.entity.Student;

@RestController
public class StudentServiceController {

	private static Map<String,List<Student>> schoolDb = new HashMap<String,List<Student>>();
	
	static{
		schoolDb = new HashMap<String,List<Student>>();
		
		List<Student> students = new ArrayList<>();
		Student student = new Student("Sai", "SRR");
		students.add(student);
		Student student1 = new Student("venkat", "NMREC");
		students.add(student1);
		
		schoolDb.put("School1", students);
	}
	
	@RequestMapping(value="/student/{schoolname}", method = RequestMethod.GET)
	public List<Student> getStudent(@PathVariable String schoolname){
		List<Student> list = schoolDb.get(schoolname);
		if( list == null) {
			list = new ArrayList<>();
		Student std = new Student("404 Not Found", "N/A");
		list.add(std);
		}
		return list;
		
	}
}
