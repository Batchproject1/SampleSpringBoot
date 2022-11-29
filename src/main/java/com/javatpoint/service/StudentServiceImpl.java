package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.entity.Student;
import com.javatpoint.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService  
{
	@Autowired
	StudentRepository repo;
@Override
public List<Student> findAll()
{
	
	return repo.findAll();

}
}
