-- 1.  Create a report that displays the last name and salary of employees who earn more than $12,000.

select last_name, salary from departments where salary>12000;

-- 2.  select last_name, salary from departments where salary>12000;

select last_name, dept_id from departments where emp_id = 176;

-- 3.  To find high-salary and low-salary employees. Create a query to display the last name and salary for any employee 
--     whose salary is not in the range of $5,000 to $12,000



-- 4.  Create a report to display the last name, job ID, and hire date for employees with the last names of Matos and Taylor. 
--     Order the query in ascending order by the hire date.
-- 5.  Display the last name and department ID of all employees in departments 20 or 50 in ascending alphabetical order by name.
-- 6.  List employees who earn between $5,000 and $12,000, and are in department 20 or 50. Label the columns as
--     Employee and Monthly Salary, respectively.	
-- 7.  Create a report that displays the last name and hire date for all employees who were hired in 1994.

-- 8.  Create a report to display the last name and job title of all employees who do not have a manager.
-- 9.  Create a report to display the last name, salary, and commission of all employees who earn commissions. 
--     Sort data in descending order based on salary and commissions. Use the column’s numeric position in the ORDER BY clause.
-- 10. Create a report that displays the last name and salary of employees who earn more than an amount that the user specifies after a prompt. 
--     If you enter 12000, it should display all employees earning more than 12000.
--     Eg: Salary_value: 12000
-- 11. Create a query that prompts the user for a manager ID and generates the employee ID, last name, salary and department for that manager’s employees and
--     prompts a column name by which result should be sorted.
--     Eg:
--        manager_id :103
--        sorted_by : last_name
-- 12. Display all employee last names in which the third letter of the name is “a”.
-- 13. Display the last names of all employees who have both an “a” and an “e” in their last name.
-- 14. Display the last name, job, and salary for all employees whose jobs are either those of a sales representative or of a stock clerk, and whose salaries are not equal to $2,500, $3,500, or $7,000.
