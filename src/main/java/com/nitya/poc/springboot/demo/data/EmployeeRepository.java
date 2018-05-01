package com.nitya.poc.springboot.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{ 
	
}
