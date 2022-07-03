-- 1.  Determine the structure of the DEPARTMENTS table and its contents.

desc departments;

-- 2. Create a query to display the last name, job ID, hire date, and employee ID for each employee, with the employee ID appearing first. 
--    Provide an alias STARTDATE for the HIRE_DATE column.

select emp_id, last_name, jobid, hire_date from departments;

-- 3.  Create a query to display all unique job IDs from the EMPLOYEES table.

select UNIQUE(jobid) from departments;

-- 4.  Create a query to display employee id, last name, job id and hiredate from employee table with more describing column names.
--     Name the column headings Emp # , Employee , Job and Hire Date respectively.

select emp_id as "Emp #", last_name as "Employee", Jobid as "JOB", hire_date as "Hire Date" from departments; 
