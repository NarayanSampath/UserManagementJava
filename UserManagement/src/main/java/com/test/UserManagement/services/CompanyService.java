package com.test.UserManagement.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.UserManagement.amodels.Company;
import com.test.UserManagement.zrepository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> getAllCompanies(){
		List<Company> companies = new ArrayList<>();
		companyRepository.findAll().forEach(companies::add);
		return companies;		
	}
	
	public Company getCompany(String idStr){
		return companyRepository.findById(Long.parseUnsignedLong(idStr)).get();
	}
	
	public Company createRUpdateCompany(Company company){
		return companyRepository.save(company);
	}
		
	public void deleteCompany(String idStr){
		companyRepository.deleteById(Long.parseLong(idStr));		 
	} 

}
