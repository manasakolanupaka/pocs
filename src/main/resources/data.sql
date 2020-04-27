INSERT INTO TBL_EMPLOYEES 
    (first_name, last_name, email ) 
VALUES
    ('Lokesh', 'Gupta', 'abc@gmail.com'),
    ('Deja', 'Vu', 'xyz@email.com'),
    ('Caption', 'America', 'cap@marvel.com'); 
    
    
 INSERT INTO TBL_DEPARTMENT
 (department_name ) 
 values 
 ('Admin'),
 ('ProductionSupport'),
 ('Developer');
 
  Insert INTO TBL_DEPT_EMPLOYEE
 (employee_id, department_id) values
 ('1', '1'),('2','3'),('3','2'),('1','3');
 
    
 INSERT INTO TBL_ROLE
 (role) 
 values 
 ('Manager'),
 ('Lead'),
 ('HR');
 
  Insert INTO TBL_ROLE_EMPLOYEE
 (employee_id, role_id) values
 ('1', '1'),('2','3'),('3','2'),('1','3');
 
 Insert INTO TBL_INSURANCE
 (employee_id, insurance_plan,insurance_amount,
  status) values ('1','STAR HEALTH','200','ACTIVE'),('2','STAR HEALTH','200','ACTIVE'),
  ('3','STAR HEALTH','200','ACTIVE');