package com.test.UserManagement.amodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	@GeneratedValue
	private Long companyId;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Employee >employees;
   @ManyToMany
	private List<Project> projects;

public Long getCompanyId() {
	return companyId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}


}
