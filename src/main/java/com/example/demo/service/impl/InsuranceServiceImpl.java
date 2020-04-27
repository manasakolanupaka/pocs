package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.InsuranceEntity;
import com.example.demo.repositories.InsuranceRepository;
import com.example.demo.service.InsuranceService;

@Service
public class InsuranceServiceImpl  implements InsuranceService {
	
	@Autowired
	InsuranceRepository iRepo;

	@Override
	public List<InsuranceEntity> fetchInsuranceDetails() {
		// TODO Auto-generated method stub
		return iRepo.findAll();
	}

}
