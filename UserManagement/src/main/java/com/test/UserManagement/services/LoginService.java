package com.test.UserManagement.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.UserManagement.amodels.LoginCred;
import com.test.UserManagement.zrepository.LoginRepository;
@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepo;
	
	public List<LoginCred> getAllCreds(){
		List<LoginCred> creds = new ArrayList<>();
		loginRepo.findAll().forEach(creds::add);
		return creds;		
	}
	
	public LoginCred getCred(String idStr){
		return loginRepo.findById(Long.parseUnsignedLong(idStr)).get();
	}
	
	public LoginCred createRUpdateCred(LoginCred loginCred){
		return loginRepo.save(loginCred);
	}
		
	public void deleteCred(String idStr){
		loginRepo.deleteById(Long.parseLong(idStr));		 
	} 
	
}
