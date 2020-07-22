#6. Return highest salary, employee_name, department_name for EACH department

SELECT e.salary, e.first_name, e.last_name, d.department_name FROM Department d
JOIN (
	SELECT e1.* FROM Employee e1
    JOIN (
		SELECT department_id, MAX(salary) as maxSalary from Employee
		GROUP BY department_id
        ) e2
        ON e1.department_id = e2.department_id
        AND e1.salary = e2.maxSalary
	) e
	ON d.department_id = e.department_id;
    
select * from employee