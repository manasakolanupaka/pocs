package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeService service;

	@GetMapping("/employees")
	public List<EmployeeEntity> getEmployeeDetails() {
		List<EmployeeEntity> empdetails = service.fetchEmployeeDetails();
		logger.info(empdetails.toString());
		return empdetails;
	}

	@PostMapping("/createEmployee")
	public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity e) {
		EmployeeEntity newEmployee = service.createEmployee(e);
		return newEmployee;

	}

	@GetMapping("/getById/{id}")
	public Optional<EmployeeEntity> getEmployeeById(@PathVariable(value = "id") Long Id) {
		return service.fetchEmployeeById(Id);

	}
//	@PostMapping("/createEmployeeInDepartment/{department}")
	
	@GetMapping("/employeeswithroles")
	public List<EmployeeEntity> getEmployeeRoleDetails() {
		List<EmployeeEntity> empRoledetails = service.fetchEmployeeDetails();
		logger.info(empRoledetails.toString());
		return empRoledetails;
	}

	
}
