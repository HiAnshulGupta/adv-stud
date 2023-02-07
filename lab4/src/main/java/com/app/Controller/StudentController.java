package com.app.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Student;
import com.app.service.StudentService;


@RestController
@CrossOrigin(origins ="http://localhost:3000")
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService std;
	
	public StudentController() {
		System.out.println("in def ctor"+getClass());
		
	}
	@GetMapping
	public List<Student> getstd(){
		System.out.println("in get std");
		return std.getAllstdDetails();
	}
	@PostMapping
	public Student saveStd(@RequestBody Student stdd) {
		
		System.out.println("in save std"+stdd);
		return std.addstudent(stdd);
	}
	@DeleteMapping("/{id}")
	public String Deletebyid(@PathVariable Long id) {
		
		System.out.println("deleted"+id);
		return std.stdDeletebyid(id);
	}
	@PutMapping
	public Student studup(Student stdd) {
		System.out.println("update"+stdd);
		return std.stdUpdate(stdd);
	}

}
