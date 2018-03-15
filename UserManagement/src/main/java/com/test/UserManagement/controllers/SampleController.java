package com.test.UserManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.test.UserManagement.amodels.Company;
import com.test.UserManagement.amodels.Designation;
import com.test.UserManagement.amodels.Employee;
import com.test.UserManagement.amodels.LoginCred;
import com.test.UserManagement.amodels.Project;
import com.test.UserManagement.services.CompanyService;
import com.test.UserManagement.services.DesignationService;
import com.test.UserManagement.services.EmployeeService;
import com.test.UserManagement.services.LoginService;
import com.test.UserManagement.services.ProjectService;

@RestController
@EnableAutoConfiguration
public class SampleController {
	@Autowired
	LoginService loginService;
	@Autowired
	EmployeeService employeeService;
	@Autowired
	CompanyService companyService;
	@Autowired
	DesignationService designationService;
	@Autowired
	ProjectService projectService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	ModelAndView home() {
		return new ModelAndView("welcome.html");
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(value = "/creds", method = RequestMethod.GET)
	List<LoginCred> getAllloginCred() {
		return loginService.getAllCreds();
	}

	@RequestMapping(value = "/creds/{id}", method = RequestMethod.GET)
	LoginCred getCred(@PathVariable("id") String idStr) {
		return loginService.getCred(idStr);
	}

	@RequestMapping(value = { "/creds/create", "/creds/update" }, method = RequestMethod.POST)
	LoginCred createCred(@RequestBody LoginCred loginCred) {
		return loginService.createRUpdateCred(loginCred);
	}

	@RequestMapping(value = "/creds/delete/{id}", method = RequestMethod.DELETE)
	void deleteCred(@PathVariable("id") String idStr) {
		loginService.deleteCred(idStr);
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	Employee getEmployee(@PathVariable("id") String idStr) {
		return employeeService.getEmployee(idStr);
	}

	@RequestMapping(value = { "/emp/create", "/emp/update" }, method = RequestMethod.POST)
	Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createRUpdateEmployee(employee);
	}

	@RequestMapping(value = "/emp/delete/{id}", method = RequestMethod.DELETE)
	void deleteEmployee(@PathVariable("id") String idStr) {
		employeeService.deleteEmployee(idStr);
	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping(value = "/comp", method = RequestMethod.GET)
	List<Company> getAllCompanies() {
		return companyService.getAllCompanies();
	}

	@RequestMapping(value = "/comp/{id}", method = RequestMethod.GET)
	Company getCompany(@PathVariable("id") String idStr) {
		return companyService.getCompany(idStr);
	}

	@RequestMapping(value = { "/comp/create", "/comp/update" }, method = RequestMethod.POST)
	Company createCompany(@RequestBody Company company) {
		return companyService.createRUpdateCompany(company);
	}

	@RequestMapping(value = "/comp/delete/{id}", method = RequestMethod.DELETE)
	void deleteCompany(@PathVariable("id") String idStr) {
		companyService.deleteCompany(idStr);
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(value = "/designation", method = RequestMethod.GET)
	List<Designation> getAllloginDesignation() {
		return designationService.getAllDesignations();
	}

	@RequestMapping(value = "/designation/{id}", method = RequestMethod.GET)
	Designation getDesignation(@PathVariable("id") String idStr) {
		return designationService.getDesignation(idStr);
	}

	@RequestMapping(value = { "/designation/create", "/designation/update" }, method = RequestMethod.POST)
	Designation createDesignation(@RequestBody Designation designation) {
		return designationService.createRUpdateDesignation(designation);
	}

	@RequestMapping(value = "/designation/delete/{id}", method = RequestMethod.DELETE)
	void deleteDesignation(@PathVariable("id") String idStr) {
		designationService.deleteDesignation(idStr);
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(value = "/proj", method = RequestMethod.GET)
	List<Project> getAllProjects() {
		return projectService.getAllProjects();
	}

	@RequestMapping(value = "/proj/{id}", method = RequestMethod.GET)
	Project getProject(@PathVariable("id") String idStr) {
		return projectService.getProject(idStr);
	}

	@RequestMapping(value = { "/proj/create", "/proj/update" }, method = RequestMethod.POST)
	Project createProject(@RequestBody Project project) {
		return projectService.createRUpdateProject(project);
	}

	@RequestMapping(value = "/proj/delete/{id}", method = RequestMethod.DELETE)
	void deleteProject(@PathVariable("id") String idStr) {
		projectService.deleteProject(idStr);
	}

}