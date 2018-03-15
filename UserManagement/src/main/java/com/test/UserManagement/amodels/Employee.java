package com.test.UserManagement.amodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long employeeId;
	private String email;
	private Long phone;
	@ManyToOne(cascade=CascadeType.ALL)
	private Company company;
	@ManyToOne(cascade=CascadeType.ALL)
	private Designation designation;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Project> project;

	public Long getEmployeeId() {
		return employeeId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}

	
}
