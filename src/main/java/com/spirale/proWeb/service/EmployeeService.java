package com.spirale.proWeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.spirale.proWeb.Dto.CustomerDto;
import com.spirale.proWeb.entity.Customer;
import com.spirale.proWeb.entity.Employee;
import com.spirale.proWeb.repository.CustomerRepository;
import com.spirale.proWeb.repository.EmployeeRepository;
import com.spirale.proWeb.response.ResponseObject;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	

	
	public Employee createEmployee(Employee employee) {
		return  employeeRepository.save(employee);
	}
	
	public List<Employee> getEmployee() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getOne( Integer empId ) {
		
		return employeeRepository.findById(empId);
		
	}
	public Employee findName(String name) {
	return employeeRepository.findByName(name);	
	}
	
 public Employee getNameandId(String name, Integer empId) {
	return employeeRepository.findByNameAndEmpId(name,empId);
	 
 }
	
	public ResponseObject deleteEmp(Integer empId) {
	   Optional<Employee> emp= employeeRepository.findById(empId);
		if(emp.isPresent()) {
		employeeRepository.deleteById(empId);
		return new ResponseObject("Data deleted",emp,"200"); // jitni detail iss ne delete ki thi yaha pr return krdega
		
	}
	else {
		return new ResponseObject("data not found", emp, "404");

	}
}
	public String  getEmpByName(String name) {
	  return employeeRepository.findByEmpName(name);
	}
	
	public ResponseObject updateEmp(Employee emp) {
		Optional<Employee> employeeDetails= employeeRepository.findById(emp.getEmpId());
		if(employeeDetails.isPresent() && emp.equals(employeeDetails))
		{
			return new ResponseObject("Data already present",employeeDetails,"ok");
		}
		else {
			Employee save= employeeRepository.save(emp);
			return new ResponseObject("Data updated",save,"200");
		}
		
	}

	
}
	
