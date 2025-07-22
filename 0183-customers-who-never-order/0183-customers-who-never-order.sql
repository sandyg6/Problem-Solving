# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers AS C
LEFT JOIN Orders AS o
ON o.CustomerId = c.id
WHERE o.customerId IS NULL;