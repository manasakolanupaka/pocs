package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.AuditEntity;

public interface AuditService  {
		public List<AuditEntity> fetchAuditDetails();
		public void createEntry(AuditEntity audit);
		
}
