insert into customer (id, customer_first_name, customer_last_name, role, age)
values (1, 'Ola', 'Nordmann', 'Applicant', 21);

insert into product (product_type, id, description, name, type, interest_rate)
values (2, 1, 'House loan for people under the age of 35', 'House loan for young people', 'Young', 1.99);

insert into product (product_type, id, description, name, type)
values (1, 2, 'Certificate that confirms that the customer has been guaranteed a loan', 'Preapproval letter', 'Preapproval letter');

insert into product (product_type, id, description, name, type)
values (2, 3, 'Unfinished application', 'House loan application', 'House loan application');

insert into product (product_type, id, description, name, type, interest_rate)
values (2, 4, 'Our best interest rate for real estates with a green profile', 'Green house loan', 'Green', 1.80);

insert into product (product_type, id, description, name, type, interest_rate)
values (2, 5, 'Regular house loan', 'House loan', 'Normal', 2.20);

insert into case_table (case_id, purchase_amount, loan_amount, equity, downpayment_period, income, debt, date, status, customer_id, product_id)
values (1, 3500000, 3000000, 500000, 0, 600000, 200000, '2022-03-03', 'Finished', 1, 1);

insert into case_table (case_id, purchase_amount, loan_amount, equity, downpayment_period, income, debt, date, status, customer_id, product_id)
values (2, 2700000, 2300000, 400000, 0, 550000, 150000, '2022-03-01', 'Ready for approval', 1, 2);