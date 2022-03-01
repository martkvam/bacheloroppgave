#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE DATABASE case_db;
    GRANT ALL PRIVILEGES ON DATABASE case_db TO dbuser;
EOSQL