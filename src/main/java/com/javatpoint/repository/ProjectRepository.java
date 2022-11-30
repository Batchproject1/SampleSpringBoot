package com.javatpoint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
	List<Project> findAll();
}
