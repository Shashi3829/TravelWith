package com.spirale.proWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spirale.proWeb.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findByName(String name);
	
	public Employee findByNameAndEmpId(String name, Integer empId);
//	@Query(value="Select name from Employee e where e.name=:name")
	@Query(value="Select name from Employee where name=:name" , nativeQuery=true)
	public String findByEmpName(String name);
	
}