package com.spirale.proWeb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@Column(name="cutomer_Id",length=45)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int customerid ;
	
	public Customer() {
		
	}
	
	public Customer(int customerid, String employeename, String email, String password) {
		super();
		customerid = customerid;
		this.employeename = employeename;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [Customerid=" + customerid + ", employeename=" + employeename + ", email=" + email
				+ ", password=" + password + "]";
	}

	@Column(name="employee_name",length=255)
	private String employeename;
	
	
	@Column(name="email",length=255)
	private String email;
	
	@Column(name="password",length=255)
	private String password;

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		customerid = customerid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
