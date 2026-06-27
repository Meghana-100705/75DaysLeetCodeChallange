# Write your MySQL query statement below
Select p.product_name,s.year,s.price From Product p Inner Join Sales s ON s.product_id=p.product_id;