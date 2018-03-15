package com.test.UserManagement.zrepository;

import org.springframework.data.repository.CrudRepository;

import com.test.UserManagement.amodels.Company;

public interface CompanyRepository extends CrudRepository<Company, Long>{

}
