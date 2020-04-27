package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

}
