# Write your MySQL query statement below

Select employee_id
From Employees
Where salary < 30000 and manager_id Not in  ( Select employee_id From Employees)
order by employee_id;