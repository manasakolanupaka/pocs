package com.example.demo.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entities.EmployeeEntity;

@Mapper
public interface MyBatisEmployeeRepository {
	@Insert("INSERT INTO TBL_EMPLOYEES (id,first_name, last_name, email )VALUES (#{id}, #{firstName}, #{lastName}, #{email})")
	@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
	void insertEmployee(EmployeeEntity employeeEntity);

	List<EmployeeEntity> findAllEmployees();
	
	
}
