#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE DATABASE case_service;
    GRANT ALL PRIVILEGES ON DATABASE case_service TO dbuser;

    CREATE DATABASE altinn_service;
    GRANT ALL PRIVILEGES ON DATABASE altinn_service TO dbuser;

    CREATE DATABASE broker_service;
    GRANT ALL PRIVILEGES ON DATABASE broker_service TO dbuser;

EOSQL