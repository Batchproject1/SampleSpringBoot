package com.javatpoint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	List<Student> findAll();
}