# Write your MySQL query statement below
select e.name , b.bonus
from employee  e
LEFT JOIN  bonus  b
on b.empId = e.empId
where b.bonus < 1000
or b.bonus is null

