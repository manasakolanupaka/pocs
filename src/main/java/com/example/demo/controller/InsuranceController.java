package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.InsuranceEntity;
import com.example.demo.service.InsuranceService;


@RestController
@RequestMapping("/api")
public class InsuranceController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	InsuranceService service;
	
	@GetMapping("/insurance")
	public List<InsuranceEntity> getInsuranceDetails() {
		List<InsuranceEntity> iDetails = service.fetchInsuranceDetails();
		logger.info(iDetails.toString());
		return iDetails;
	
}
}
