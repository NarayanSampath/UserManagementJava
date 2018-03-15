package com.test.UserManagement.zrepository;

import org.springframework.data.repository.CrudRepository;

import com.test.UserManagement.amodels.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
