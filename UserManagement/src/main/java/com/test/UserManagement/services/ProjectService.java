package com.test.UserManagement.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.UserManagement.amodels.Project;
import com.test.UserManagement.zrepository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;

	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<>();
		projectRepository.findAll().forEach(projects::add);
		return projects;
	}

	public Project getProject(String idStr) {
		return projectRepository.findById(Long.parseUnsignedLong(idStr)).get();
	}

	public Project createRUpdateProject(Project project) {
		return projectRepository.save(project);
	}

	public void deleteProject(String idStr) {
		projectRepository.deleteById(Long.parseLong(idStr));
	}

}
