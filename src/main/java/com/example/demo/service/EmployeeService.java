package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.EmployeeEntity;

public interface EmployeeService {
	public List<EmployeeEntity> fetchEmployeeDetails();
	public EmployeeEntity createEmployee(EmployeeEntity emp);
	public Optional<EmployeeEntity> fetchEmployeeById(Long empId);
	//public EmployeeEntity createEmployeeInDepartment(EmployeeEntity e,String Department );
	
}
