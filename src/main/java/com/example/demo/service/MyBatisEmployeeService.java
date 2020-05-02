package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.EmployeeEntity;

public interface MyBatisEmployeeService {
	void createEmployee(EmployeeEntity e);

	List<EmployeeEntity> getAllEmployees();

}