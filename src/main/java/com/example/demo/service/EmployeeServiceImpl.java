package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public List<EmployeeEntity> fetchEmployeeDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
