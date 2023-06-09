package com.spirale.proWeb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spirale.proWeb.Dto.CustomerDto;
import com.spirale.proWeb.entity.Customer;
import com.spirale.proWeb.entity.Employee;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Optional<Customer> findOneByEmailAndPassword(String email, String password);
	
	Customer findByEmail(String email);

	Customer save(CustomerDto cusDto);
}
