package com.spirale.proWeb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spirale.proWeb.Dto.CustomerDto;
import com.spirale.proWeb.Dto.LoginDto;
import com.spirale.proWeb.entity.Employee;
import com.spirale.proWeb.response.LoginResponse;
import com.spirale.proWeb.response.ResponseObject;

import com.spirale.proWeb.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
//   CustomerService customerService;
	
	@PostMapping("/create")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.createEmployee(employee);
		}
	@PutMapping("/Update")
	public ResponseObject updateEmp(@RequestBody Employee employee) {
		return service.updateEmp(employee);
		}
    @GetMapping("/getAll")
    public List<Employee> getAll() {
    	return service.getEmployee();
    }
    @GetMapping("/getOne/{empId}")
    public Optional<Employee> getOne(@PathVariable Integer empId) {
		return service.getOne(empId);
    	
    }
    @GetMapping("/getName/{name}")
    	public Employee findEmpoyeeName(@PathVariable String name) {
			return service.findName(name);
    	
    }
    @GetMapping("/emp/{name}")
	public String find(@PathVariable String name) {
		return service.getEmpByName(name);
	
}

    @GetMapping("/getByNameAndId/{name}/{empId}")
    public Employee fetchNameandId(@PathVariable String name, @PathVariable Integer empId) {
		return service.getNameandId(name, empId);
    	
    }
    @DeleteMapping("/deleteEmp/{empId}")
    public ResponseObject deleteemp(@PathVariable Integer empId) {
		return service.deleteEmp(empId);
    	
    }
    
//    @PostMapping("/signup")
//    public ResponseObject signUpEmployee(@RequestBody CustomerDto customerDto) {
//    	return service.signUPCustomer(customerDto);
//    	
//    }
    
//    @PostMapping("/login")
//    public ResponseEntity<?> loginEmployee(@RequestBody LoginDto loginDto){
//		LoginResponse loginRes=customerService.loginEmployee(loginDto);
//		return ResponseEntity.ok(loginRes);
//    	
//    }
    
}

