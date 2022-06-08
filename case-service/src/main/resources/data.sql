insert into customer (id, customer_first_name, customer_last_name, role, age)
values (1, 'Ola', 'Nordmann', 'Applicant', 21);

insert into product (product_type, id, description, name, type, interest_rate)
values (2, 1, 'House loan for people under the age of 35', 'Boliglån for unge', 'Young', 1.99);

insert into product (product_type, id, description, name, type)
values (1, 2, 'Certificate that confirms that the customer has been guaranteed a loan', 'Finansieringsbevis bolig', 'Finansieringsbevis bolig');

insert into product (product_type, id, description, name, type)
values (2, 3, 'Unfinished application', 'House loan application', 'House loan application');

insert into product (product_type, id, description, name, type, interest_rate)
values (2, 4, 'Vår beste rente for boliger med grønn miljø', 'Grønt boliglån for unge', 'Green', 1.80);

insert into product (product_type, id, description, name, type, interest_rate)
values (2, 5, 'Regular house loan', 'House loan', 'Normal', 2.20);

insert into case_table (case_id, purchase_amount, loan_amount, equity, downpayment_period, income, debt, date, status, customer_id, product_id)
values (2, 10000000, 8500000, 3000000, 0, 2000000, 100000, '2022-03-02', 'Klar til å fortsette', 1, 2);