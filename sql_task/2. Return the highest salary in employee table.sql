#2. Return the highest salary in employee table
#first way
SELECT salary FROM Employee
ORDER BY salary DESC
LIMIT 1;

#second way
SELECT salary FROM Employee
WHERE  salary = (SELECT MAX(salary) FROM Employee);