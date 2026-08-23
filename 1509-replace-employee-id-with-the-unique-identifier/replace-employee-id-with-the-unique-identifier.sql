# Write your MySQL query statement below
select euni.unique_id , e.name 
from EmployeeUNI euni 
right join Employees e
on euni.id = e.id;