package com.test.UserManagement.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.UserManagement.amodels.Employee;
import com.test.UserManagement.zrepository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;		
	}
	
	public Employee getEmployee(String idStr){
		return employeeRepository.findById(Long.parseUnsignedLong(idStr)).get();
	}
	
	public Employee createRUpdateEmployee(Employee employee){
		return employeeRepository.save(employee);
	}
		
	public void deleteEmployee(String idStr){
		employeeRepository.deleteById(Long.parseLong(idStr));		 
	} 

}
