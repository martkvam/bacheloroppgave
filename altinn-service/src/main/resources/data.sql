insert into real_estate(product_type, id, address, type, energy_class, unit_number, cooperative_name, shared_debt)
values (1, 1, 'Pilestredet 35', 'Borettslag', 'A', 0302, 'Tertitten borettslag', 300000),
(1, 2, 'Bogstadveien 21', 'Borettslag', 'B', 1322, 'Bogstadveien borettslag', 100000),
(1, 3, 'Blindernveien 8', 'Borettslag', 'C', 5302, 'Blindern borettslag', 75000);

insert into real_estate(product_type, id, address, type, energy_class, postal_code, cadastral_number, title_number, section_number, lease_number)
values (2, 4, 'Heidmanns gate 23', 'Selveier', 'B', 2317, 17, 235, 2, 4),
(2, 5, 'Bergstien 16', 'Selveier', 'E', 0360, 12, 340, 1, 3),
(2, 6, 'Toftes gate 32', 'Selveier', 'A', 4317, 8, 90, 5, 9),
(2, 7, 'Vestgrensa 8', 'Selveier', 'A', 0315, 19, 210, 3, 4),
(2, 8, 'Waldemar Thranes gate 8', 'Selveier', 'D', 0395, 19, 210, 3, 4),
(2, 9, 'Silurveien 10', 'Selveier', 'C', 3395, 10, 510, 7, 4);

insert into purchase_contract (id, broker_id, purchase_amount, social_security_nr, purchase_date, real_estate_id)
values (1, 1, 3500000, 12049500339, '2020-02-03', 1),
(2, 2, 4300000, 12049500339, '2022-02-03', 2),
(3, 3, 3950000, 12049500339, '2022-02-03', 3),
(4, 4, 2800000, 12049500339, '2022-02-03', 4),
(5, 5, 4350000, 12049500339, '2022-02-03', 5),
(6, 6, 6500000, 12049500339, '2022-02-03', 6),
(7, 7, 4500000, 12049500339, '2022-02-03', 7),
(8, 1, 3250000, 12049500339, '2021-05-03', 8),
(9, 1, 6700000, 12049500339, '2022-02-03', 9);