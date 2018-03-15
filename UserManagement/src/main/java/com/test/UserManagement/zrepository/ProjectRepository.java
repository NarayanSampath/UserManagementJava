package com.test.UserManagement.zrepository;

import org.springframework.data.repository.CrudRepository;

import com.test.UserManagement.amodels.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>{

}
