insert into customer (id, customer_first_name, customer_last_name, role)
values (1, 'Ola', 'Nordmann', 'Applicant');

insert into product (id, description, name, type)
values (1, 'House loan for people under the age of 35', 'House loan for young people', 'House loan');

insert into product (id, description, name, type)
values (2, 'Certificate that confirms that the customer has been guaranteed a loan', 'Preapproval letter', 'Preapproval letter');

insert into case_table (case_id, amount, date, status, customer_id, product_id)
values (1, 3500000, '2022-03-03', 'Finished', 1, 1);

insert into case_table (case_id, amount, date, status, customer_id, product_id)
values (2, 2700000, '2022-03-01', 'Ready for approval', 1, 2);