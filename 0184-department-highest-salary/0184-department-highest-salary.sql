# Write your MySQL query statement below
SELECT d.name AS Department, e.name AS Employee, e.salary as Salary
FROM Employee AS e
JOIN Department AS d
ON e.departmentId = d.id
WHERE e.salary = (SELECT MAX(salary) FROM Employee 
WHERE departmentId = e.departmentId);