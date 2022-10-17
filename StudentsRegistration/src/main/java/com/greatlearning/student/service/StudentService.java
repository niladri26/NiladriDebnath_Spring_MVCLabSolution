package com.greatlearning.student.service;

import java.util.List;

import com.greatlearning.student.entity.Student;


public interface StudentService {


	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

	public List<Student> findAll();

	

}