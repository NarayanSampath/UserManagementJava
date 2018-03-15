package com.test.UserManagement.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.UserManagement.amodels.Designation;
import com.test.UserManagement.zrepository.DesignationRepository;

@Service
public class DesignationService {
	@Autowired
	DesignationRepository designationRepository;
	public List<Designation> getAllDesignations(){
		List<Designation> designations = new ArrayList<>();
		designationRepository.findAll().forEach(designations::add);
		return designations;		
	}
	
	public Designation getDesignation(String idStr){
		return designationRepository.findById(Long.parseUnsignedLong(idStr)).get();
	}
	
	public Designation createRUpdateDesignation(Designation designation){
		return designationRepository.save(designation);
	}
		
	public void deleteDesignation(String idStr){
		designationRepository.deleteById(Long.parseLong(idStr));		 
	} 

}
