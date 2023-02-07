package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Student;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentserviceImpl implements StudentService {
	
	@Autowired
	private StudentRepository stdRepo;
	
	

	@Override
	public List<Student> getAllstdDetails() {
		// TODO Auto-generated method stub
		return stdRepo.findAll();
	}



	@Override
	public Student addstudent(Student std) {
		// TODO Auto-generated method stub
		return stdRepo.save(std);
	}



	@Override
	public String stdDeletebyid(Long id) {
		// TODO Auto-generated method stub
		String a="deletion failed";
		if(stdRepo.existsById(id)){
			stdRepo.deleteById(id);
			a="deleted"+id;
			
		}
		return a;
	}



	@Override
	public Student stdUpdate(Student stud) {
		// TODO Auto-generated method stub
		
		return stdRepo.save(stud);
	}
	
	

}
