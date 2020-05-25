package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.entities.InsuranceEntity;
import com.example.demo.repositories.DepartmentRepository;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.InsuranceRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository repo;
	@Autowired
	DepartmentRepository dRepo;
	@Autowired
	InsuranceRepository iRepo;
	@Autowired
	JmsTemplate jmsTemplate;

	@Override
	public List<EmployeeEntity> fetchEmployeeDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	@Transactional
	public EmployeeEntity createEmployee(EmployeeEntity e) {
		EmployeeEntity newEmployee = repo.save(e);
		if("dummy".equals(newEmployee.getFirstName()))
		{
			throw new RuntimeException("testing transactions");
		}
		
		InsuranceEntity insurance = new InsuranceEntity();
		insurance.setEmployeeId(newEmployee.getId());
		insurance.setStatus("Active");
		insurance.setInsuranceAmount(200);
		insurance.setInsurancePlan("STAR HEALTH");
		iRepo.save(insurance);
		jmsTemplate.convertAndSend("jms.message.testQueue", e);
		return e;
	}

	@Override
	public Optional<EmployeeEntity> fetchEmployeeById(Long EmployeeId) {
		return repo.findById(EmployeeId);
	}

}
