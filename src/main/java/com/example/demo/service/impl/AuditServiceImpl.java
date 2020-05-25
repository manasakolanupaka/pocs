package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.AuditEntity;
import com.example.demo.repositories.AuditRepository;
import com.example.demo.service.AuditService;

@Service
public class AuditServiceImpl implements AuditService {

	@Autowired
	AuditRepository auditRepo;
	
	@Override
	public List<AuditEntity> fetchAuditDetails() {
		// TODO Auto-generated method stub
		
		return auditRepo.findAll();
	}

	@Override
	public void createEntry(AuditEntity audit) {
		// TODO Auto-generated method stub
		AuditEntity newEntry= auditRepo.save(audit);
	
	}

}
