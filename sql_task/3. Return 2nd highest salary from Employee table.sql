#3. Return 2nd highest salary from Employee table
#first way
SELECT salary FROM Employee
ORDER BY salary DESC
LIMIT 1 , 1;

#second way
SELECT salary FROM Employee
WHERE  salary = (SELECT MAX(salary) FROM Employee WHERE salary < (SELECT MAX(salary) FROM Employee));
