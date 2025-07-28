# Write your MySQL query statement below
select e.employee_id, e.name, COUNT(*) as reports_count,
ROUND(AVG(emp.age*1.0),0) as average_age
from Employees as e
INNER JOIN Employees as emp
on e.employee_id = emp.reports_to
GROUP BY e.employee_id, e.name
ORDER BY e.employee_id;