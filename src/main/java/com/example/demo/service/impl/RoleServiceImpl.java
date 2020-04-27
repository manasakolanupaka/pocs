package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.RoleEntity;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepository rRepo;

	public List<RoleEntity> fetchRoleDetails() {
		return rRepo.findAll();
	}
}
