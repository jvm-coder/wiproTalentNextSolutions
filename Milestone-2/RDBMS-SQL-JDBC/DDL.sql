-- 1.  Create the DEPT table based on the following table instance chart. Save the statement in a script called lab_10_01.sql , and 
--     then execute the statement in the script to create the table. Confirm that the table is created.
--     Specification Values:
--     Column named Dept_ID of Numeric 7 size and would be a primary key.
--     Column named Dept_Name of varchar2 size 20.

create table Dept (Dept_ID number(7) primary key, 
                   Dept_Name varchar2(20));
                   
-- 2.  Populate the DEPT table with data from the DEPARTMENTS table. Include only columns that you need.
--     Insert dept Id 10 and Name Accounts
--     Insert dept Id as null and Name as TT
--     Correct by giving 20 and TT
--     Insert A1 as Id and Accounts
--     Correct by giving 30 and Accounts

insert into dept (select dept_id, dept_name from departments);
insert into dept values (10, 'ACCOUNTS');
insert into dept values (20, 'IT');
insert into dept values (30, 'ACCOUNTS');

-- 3.  Create the EMP table based on the following table instance chart. Save the statement in a script called lab_10_03.sql , and then execute the statement in the script to create the table. Confirm that the table is created.
--     Specification-  Values
--     Column Name: ID, LAST_NAME, FIRST_NAME, DEPT_ID
--     Key Type: PK,  -,  -, FK
--     Nulls /Unique:  -,  Not null,  -,  -,
--     FK Table:   -,  -,    -, Dept
--     FK Column:   -,   -,  -,  ID
--     Data type: NUMBER, VARCHAR2, VARCHAR2, NUMBER
--     Length: 7, 25, 25, 7

--     Insert 101,Sam,Sundar,10
--     Insert 101,Ram,Krishna,20
--     Insert 102,Gopi,null,40
--     Insert 103,null,ram,20
