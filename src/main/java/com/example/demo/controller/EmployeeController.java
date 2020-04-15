package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.EmployeeEntity;
//import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EmployeeService service;

	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeEntity>> getEmployeeDetails() {
		  List<EmployeeEntity> empdetails= service.fetchEmployeeDetails();
		  logger.info(empdetails.toString());
		return ResponseEntity.ok(empdetails) ;
	}
}
