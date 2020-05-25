package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.entities.EmployeePojo;

public interface MyBatisEmployeeService {
	void createEmployee(EmployeeEntity e);

	List<EmployeePojo> getAllEmployees();

}
