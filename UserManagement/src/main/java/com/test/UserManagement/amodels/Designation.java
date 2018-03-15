package com.test.UserManagement.amodels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Designation {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long designationId;
	private String designation;



	public long getDesignationId() {
		return designationId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
