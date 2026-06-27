# Write your MySQL query statement below
Select eu.unique_id,e.name from employees e Left join  employeeUNI eu on e.id=eu.id;