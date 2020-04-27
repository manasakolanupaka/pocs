package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.InsuranceEntity;

public interface InsuranceRepository  extends JpaRepository<InsuranceEntity, Long>{

}
