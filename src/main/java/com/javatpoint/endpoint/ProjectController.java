package com.javatpoint.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.entity.Project;
import com.javatpoint.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private Project proserv;

	@GetMapping(value = "/project")
	public List<Project> getProduct() {

		List<Project> project_details = proserv.findAll();
		return project_details;
	}
}
