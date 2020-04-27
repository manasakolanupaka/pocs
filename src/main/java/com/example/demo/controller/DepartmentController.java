package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.DepartmentEntity;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/api/dpt")
public class DepartmentController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	DepartmentService service;

	@GetMapping("/departments")
	public ResponseEntity<List<DepartmentEntity>> getDepartmentDetails() {
		List<DepartmentEntity> deptDetails = service.fetchDepartmentDetails();
		logger.info(deptDetails.toString());
		return ResponseEntity.ok(deptDetails);
	}
}
