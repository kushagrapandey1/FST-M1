select customer_id, customer_name from customers c
where 1<(select count(*) from orders o where c.customer_id = o.customer_id)
union
select salesman_id, salesman_name from salesman s
where 1<(select count(*) from orders o WHERE s.salesman_id = o.salesman_id)
order by customer_name;

SELECT a.salesman_id, salesman_name, order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, salesman_name, order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);