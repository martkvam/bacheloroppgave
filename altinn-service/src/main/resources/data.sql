insert into real_estate(product_type, id, address, postal_code, type, energy_class, unit_number, cooperative_name, shared_debt)
values (1, 1, 'Pilestredet 35', '0160', 'Borettslag', 'A', 0302, 'Tertitten borettslag', 300000),
(1, 2, 'Bogstadveien 21', '0670', 'Borettslag', 'B', 1322, 'Bogstadveien borettslag', 100000),
(1, 3, 'Blindernveien 8', '0115', 'Selveier', 'C', 5302, 'Blindern borettslag', 75000);

insert into real_estate(product_type, id, address, postal_code, type, energy_class, cadastral_number, title_number, section_number, lease_number)
values (2, 4, 'Heidmanns gate 23', '2317', 'Selveier', 'B', 17, 235, 2, 4),
(2, 5, 'Bergstien 16', '0360', 'Selveier', 'E', 12, 340, 1, 3),
(2, 6, 'Toftes gate 32', '0680', 'Selveier', 'A', 8, 90, 5, 9),
(2, 7, 'Vestgrensa 8', '0315', 'Selveier', 'A', 19, 210, 3, 4),
(2, 8, 'Waldemar Thranes gate 8', '0395', 'Selveier', 'D', 19, 210, 3, 4),
(2, 9, 'Silurveien 10', '2316', 'Selveier', 'C', 10, 510, 7, 4);

insert into purchase_contract (id, broker_id, broker_account, purchase_amount, social_security_nr, purchase_date, real_estate_id)
values (1, 1, '1810 12 98812', 3500000, 12049500339, '2020-02-03', 1),
(2, 2, '3578 91 88239', 4300000, 12049500339, '2022-02-03', 2),
(3, 3, '2455 28 19920', 3950000, 12049500339, '2022-02-03', 7),
(4, 4, '7821 99 11029', 10000000, 12049500339, '2022-02-03', 4),
(5, 5, '7522 23 11177', 4350000, 12049500339, '2022-02-03', 5),
(6, 6, '1204 19 88374', 6500000, 12049500339, '2022-02-03', 6),
(7, 7, '2234 11 28839', 3000000, 12049500339, '2022-02-03', 3),
(8, 1, '1810 12 98812', 3250000, 12049500339, '2021-05-03', 8),
(9, 1, '1810 12 98812', 6700000, 12049500339, '2022-02-03', 9);