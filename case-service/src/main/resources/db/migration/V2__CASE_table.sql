CREATE TABLE IF NOT EXISTS public.case_table
(
    case_id bigserial NOT NULL,
    amount bigint NOT NULL,
    case_status text NOT NULL,
    creation_date date NOT NULL,
    PRIMARY KEY (case_id)
    );

ALTER TABLE IF EXISTS public.case_table
    OWNER to dbuser;