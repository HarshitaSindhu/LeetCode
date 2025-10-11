# Write your MySQL query statement below
select s.user_id ,IFNULL( ROUND(SUM(action  = 'confirmed')/COUNT(*),2),0.00) as confirmation_rate
From Signups s
LEFT JOIN Confirmations c
ON s.user_id = c.user_id
Group BY s.user_id
