# Write your MySQL query statement below
SELECT pr.product_name , sa.year , sa.price
FROM  Product as pr
JOIN Sales as sa
ON   sa.product_id = pr.product_id