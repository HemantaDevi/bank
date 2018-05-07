package com.accenture.aa.banking.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Employee extends User{
	//cannot be not null
	//will be added to parent class as an additional column
	//will generate an error
	@Column(name="ADDRESS")
	private String address;
	
}
