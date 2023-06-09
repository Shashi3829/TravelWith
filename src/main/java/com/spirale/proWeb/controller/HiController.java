package com.spirale.proWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spirale.proWeb.Dto.CustomerDto;
import com.spirale.proWeb.entity.Customer;
import com.spirale.proWeb.response.ResponseObject;
import com.spirale.proWeb.service.CustomerService;

@RestController
@RequestMapping("/auth")
public class HiController {

	@Autowired
	CustomerService customerService;
//	@GetMapping("/hi")
//	public String hi() {
//		return "Radhe Radhe";
//	}
//	@GetMapping("/welcome")
//	public String welcome() {
//		String text= "this is private page";
//		text+="this page is not allowed to unauthenticated users";
//		return text;
//	}
	
	@PostMapping("/signup")
	public Customer customerSignup(@RequestBody CustomerDto cusDto) {
		return customerService.signUPCustomer(cusDto);
	}
}
