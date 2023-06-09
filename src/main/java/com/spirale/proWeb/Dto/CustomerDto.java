package com.spirale.proWeb.Dto;

public class CustomerDto {

	
	private int customerid ;
	private String employeename;
	private String email;
	
	public CustomerDto() {
		
	}
	@Override
	public String toString() {
		return "CustomerDto [Customerid=" + customerid + ", employeename=" + employeename + ", email=" + email
				+ ", password=" + password + "]";
	}
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
	public CustomerDto(int customerid, String employeename, String email, String password) {
		super();
		customerid = customerid;
		this.employeename = employeename;
		this.email = email;
		this.password = password;
	}
	private String password;

}
