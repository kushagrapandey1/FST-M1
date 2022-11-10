select * from orders where salesman_id = (select distinct salesman_id from orders where customer_id = 3007);

select * from orders where salesman_id = (select salesman_id from salesman where salesman_city = 'New York');

select count(customer_id) as total from customers where grade > (select avg(grade) as avggrade from customers where city = 'New York');

select * from orders where salesman_id = (select salesman_id from salesman where commission = (select max(commission) from salesman));

