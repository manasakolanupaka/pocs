package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.AuditEntity;
import com.example.demo.entities.EmployeeEntity;
import com.example.demo.service.AuditService;

@RestController
@RequestMapping("/api/audit")
public class AuditController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AuditService auditService;

	@GetMapping("/allentries")
	public List<AuditEntity> getAuditDetails() {
		List<AuditEntity> auditDetails = auditService.fetchAuditDetails();

		return auditDetails;
	}

	@PostMapping("/createentry")
	public void createAuditEntry(@RequestBody AuditEntity e) {
		auditService.createEntry(e);

	}

}
