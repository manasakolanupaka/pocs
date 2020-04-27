package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.DepartmentEntity;
import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.DepartmentRepository;
import com.example.demo.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository dRepo;

	@Override
	public List<DepartmentEntity> fetchDepartmentDetails() {
		// TODO Auto-generated method stub
		return dRepo.findAll();
	}

}
