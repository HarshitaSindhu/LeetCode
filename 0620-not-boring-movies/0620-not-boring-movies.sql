# Write your MySQL query statement below
select  id , movie , description , rating
FROM Cinema 
Where id%2 != 0
and description !='boring'
order BY rating DESC;