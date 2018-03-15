package com.test.UserManagement.zrepository;

import org.springframework.data.repository.CrudRepository;

import com.test.UserManagement.amodels.LoginCred;

public interface LoginRepository extends CrudRepository<LoginCred, Long>{

}
