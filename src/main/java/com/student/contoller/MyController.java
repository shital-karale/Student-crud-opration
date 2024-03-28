package com.student.contoller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;

import com.student.repo.StudentRepo;

@RestController
public class MyController {
	
	@Autowired
	private StudentRepo repo;
	
	
	//to get all student
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		List<Student> students=repo.findAll();
		return students;
		
	}
	
	
	//To get student data by id
	@GetMapping("/student/{id}")
	
	public Student getStudentById(@PathVariable int id) {
		Student student=repo.findById(id).get();
		return student;
	}
	
	//to add new one student data
	@PostMapping("/student/add")
	public void createStudent(@RequestBody Student std) {
		
		repo.save(std);
		
	}
	
	//to update student data by id
	@PutMapping("student/update/{id}")
      public Student updateStudent(@PathVariable int id) {
		Student std=repo.findById(id).get();
		std.setCourse("c++");
		std.setDivision("b");
		std.setName("rahu");
		repo.save(std);
		return std;
		
	}
	
	//to delete  data by id
	@DeleteMapping("student/delete/{id}")
	  public void deleteStudent(@PathVariable int id) {
		repo.deleteById(id);
		  
	  }
}
