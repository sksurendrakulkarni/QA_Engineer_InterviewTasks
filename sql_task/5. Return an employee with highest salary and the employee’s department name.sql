#5. Return an employee with highest salary and the employee’s department name
SELECT emp_id, first_name, last_name, gender, position, salary, department_id, department_name FROM Employee
INNER JOIN Department USING (department_id)
WHERE  salary = (SELECT MAX(salary) FROM Employee);