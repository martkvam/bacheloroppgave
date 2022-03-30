#!/bin/bash

echo "TEST"
cd \brokerservice
docker build -t springio/bachelor-brokerservice:0.0.1-SNAPSHOT .

cd ../api-gateway
docker build -t springio/bachelor-api-gateway:0.0.1-SNAPSHOT .

cd ../altinn-service
docker build -t springio/bachelor-altinn-service:0.0.1-SNAPSHOT .

cd ../case-service
docker build -t springio/bachelor-case-service:0.0.1-SNAPSHOT .

cd ../naming-server
docker build -t springio/bachelor-naming-server:0.0.1-SNAPSHOT .

cd ../docker
docker compose up

$SHELL

