package com.app.service;

import java.util.List;

import com.app.pojos.Student;

public interface StudentService {
	
 List<Student> getAllstdDetails();
	 
 Student addstudent(Student std);
 
 String stdDeletebyid(Long id);
 	
 Student stdUpdate(Student stud);
}
