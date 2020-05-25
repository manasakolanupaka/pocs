package com.example.demo.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.entities.EmployeePojo;

@Mapper
public interface MyBatisEmployeeRepository {
	@Insert("INSERT INTO TBL_EMPLOYEES (id,first_name, last_name, email )VALUES (#{id}, #{firstName}, #{lastName}, #{email})")
	@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
	void insertEmployee(EmployeeEntity employeeEntity);
	@Select("select emp.id as id, first_name as firstName,last_name as lastName, email as email,dpt.Department_Name as dpts,role.role as role from TBL_EMPLOYEES emp,TBL_DEPARTMENT dpt,TBL_DEPT_EMPLOYEE\r\n" + 
			"		dp_e,TBL_ROLE role ,TBL_ROLE_EMPLOYEE r_e where\r\n" + 
			"		emp.id=dp_e.employee_id and emp.id=r_e.employee_id\r\n" + 
			"		and dpt.id=dp_e.department_id and\r\n" + 
			"		role.id= r_e.role_id ;")
	List<EmployeePojo> findAllEmployees();
	
	
}
