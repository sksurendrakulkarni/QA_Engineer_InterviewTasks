#1. Return Employee record with highest salary
#first way
SELECT * FROM Employee
ORDER BY salary DESC
LIMIT 1;

#second way
SELECT * FROM Employee
WHERE  salary = (SELECT MAX(salary) FROM Employee);