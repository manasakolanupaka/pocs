package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.entities.EmployeePojo;
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
	public List<EmployeePojo> getAllEmployees() 
	{
		List<EmployeePojo> list= batisEmployeeRepo.findAllEmployees();
		
		System.out.println(list.get(0).getRole());
		return batisEmployeeRepo.findAllEmployees();
	}

}
