CREATE TABLE public.cases
(
    case_id bigserial NOT NULL,
    amount bigint NOT NULL,
    PRIMARY KEY (case_id)
);

ALTER TABLE IF EXISTS public.cases
    OWNER to dbuser;