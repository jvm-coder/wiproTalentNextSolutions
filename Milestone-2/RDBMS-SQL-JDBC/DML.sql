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

-- 3.  Insert one record without listing the column names in the insert statement. Check whether data is inserted
--     Eg:
--     employee_id    first_name    last_name    department_id     salary
--     201             Michael       Hartstein      20          13000

insert into MY_EMPLOYEE 
values(201, 'Michael', 'Hartstein', 20, 13000);

-- 4.  Insert one record without listing the column names in the insert statement where salary value remain undetermined. Check whether data is inserted
--     Eg: 
--     employee_id first_name last_name  department_id salary
--     201         Michael     Hartstein   20         13000
--     202         Pat            Fay       20         (null)

insert into MY_EMPLOYEE values (202, 'Pat', 'Fay', 20, null);

-- 5. Insert one record with listing the column names avoiding salary column in the insert statement where salary value remain undetermined. 
--    Check whether data is inserted
--    employee_id  first_name  last_name department_id salary
--    201          Michael      Hartstein   20          13000
--    202          Pat          Fay         20         (null)
--    203          Susan        Mavris      40         (null)
  
insert into MY_EMPLOYEE(emp_id, first_name, last_name, dept_id) values (203, 'Susan', 'Mavris', 40);

-- 6.  Use the above Script to insert the below given records
--     employee_id first_name last_name department_id salary
--     205        Shelley        Higgins       110      12000
--     100        Steven         King            90       24000
--     101        Neena          Kochhar       90         17000
--     102        Lex De         Haan            90       17000
--     111        Ismael         Sciarra        100        7700
--     112        Jose Manuel    Urman         100        7800
--     204        Hermann        Baer           70       10000

insert into MY_EMPLOYEE values (205, 'Shelly', 'Higgins', 110, 12000);
insert into MY_EMPLOYEE values (100, 'Steven', 'King', 90, 24000);
insert into MY_EMPLOYEE values (101, 'Neena', 'Kochhar', 90, 17000);
insert into MY_EMPLOYEE values (102, 'Lex De', 'Haan', 90, 17000);
insert into MY_EMPLOYEE values (111, 'Ismael', 'Sciarra', 100, 7700);
insert into MY_EMPLOYEE values (112, 'Jose Manu', 'Urman', 100, 7800);
insert into MY_EMPLOYEE values (201, 'Hermann', 'Baer', 70, 10000);

-- 7.  Create a query to increase salary by 10% for all employees in dept 90.

update MY_EMPLOYEE 
set salary=(salary+(salary*0.1)) 
where dept_id=90;

-- 8.  Create a query to update Last_name of emp 202 to Higgins.

update MY_EMPLOYEE 
set last_name='Higgins' 
where emp_id=202;

-- 9.  Delete employees whose name either first or last name has char seq of ‘man’

delete from MY_EMPLOYEE 
where (first_name like '%man%') OR (last_name like '%man%');
