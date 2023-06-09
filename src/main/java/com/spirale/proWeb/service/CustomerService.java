package com.spirale.proWeb.service;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spirale.proWeb.Dto.CustomerDto;
import com.spirale.proWeb.entity.Customer;
import com.spirale.proWeb.repository.CustomerRepository;
import com.spirale.proWeb.response.ResponseObject;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	
	
	public Customer signUPCustomer(CustomerDto cusDto ) {
		System.out.println(cusDto);
		
		/*
		 * CustomerDto cusD= new CustomerDto(); cusDto.setEmployeename();
		 */
//		cusDto.getPassword()
//		 String encodedPwd = "3455e)03";
	Customer cus= new Customer();
//		cus.setEmail(cusDto.getEmail());
//		cus.setPassword(encodedPwd);
		
	BeanUtils.copyProperties(cusDto, cus);
		System.out.println(cus);
	return	customerRepository.save(cus);
	
		
	/*
	 * // Optional<Customer> customer =
	 * customerRepository.findOneByEmailAndPassword(cusDto.getEmail(),cusDto.
	 * getPassword()); // if(customer.isPresent()) { // return new
	 * ResponseObject("SignUp successFull",customer.get(),"200"); // }else { //
	 * return new ResponseObject("SignUP unsuccesfull",customer,"401"); // }
	 */	}

}
