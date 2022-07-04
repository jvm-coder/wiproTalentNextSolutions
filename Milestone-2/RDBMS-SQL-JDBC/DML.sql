-- 1.  Run the below script
--     Create table MY_EMPLOYEE 
--     as
--     Select employee_id,first_name,last_name,department_id,salary from EMPLOYEES where 1=2;

Create table MY_EMPLOYEE 
as 
Select emp_id,first_name,last_name,dept_id,salary 
from departments 
where 1=2;

-- 2.  Test the table creation by viewing the structure using describe command
--     Name                           Null     Type                                                                                                                                                                                          
------------------------------ -------- ------------------------------
--     EMPLOYEE_ID                             NUMBER(6)                                                                                                                                                                                     
--     FIRST_NAME                              VARCHAR2(20)                                                                                                                                                                                  
--     LAST_NAME                      NOT NULL VARCHAR2(25)                                                                                                                                                                                  
--     DEPARTMENT_ID                           NUMBER(4)                                                                                                                                                                                     
--     SALARY                                  NUMBER(8,2)                                                                                                                                                                                   
--     5 rows selected

desc MY_EMPLOYEE;

-- 3.  
