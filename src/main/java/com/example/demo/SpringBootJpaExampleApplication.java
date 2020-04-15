package com.example.demo;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeRepository;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.repositories","com.example.entities"})
public class SpringBootJpaExampleApplication {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaExampleApplication.class, args);
	}
	

}
