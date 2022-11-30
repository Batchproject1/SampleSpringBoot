package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.entity.Project;
import com.javatpoint.repository.ProjectRepository;

@Service
public class ProjectServiceImple implements ProjectService {
	
	@Autowired
	ProjectRepository prorep;

	@Override
	public List<Project> findAll() {
		return prorep.findAll();

	}

}
