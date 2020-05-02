package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.MyBatisEmployeeRepository;
import com.example.demo.service.MyBatisEmployeeService;

@Service
public class MyBatisEmployeeServiceImpl implements MyBatisEmployeeService {

	@Autowired
	MyBatisEmployeeRepository batisEmployeeRepo;

	@Override
	public void createEmployee(EmployeeEntity e) {
		batisEmployeeRepo.insertEmployee(e);
	}

	@Override
	public List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> list= batisEmployeeRepo.findAllEmployees();
		for ( EmployeeEntity employeeEntity : list) {
			System.out.println(employeeEntity);
		}
		return batisEmployeeRepo.findAllEmployees();
	}

}
