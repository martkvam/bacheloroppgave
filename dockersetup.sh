#!/bin/bash

echo "TEST"
cd \brokerservice
docker build -t martkvam/bachelor-brokerservice:0.0.1-SNAPSHOT .

cd ../api-gateway
docker build -t martkvam/bachelor-api-gateway:0.0.1-SNAPSHOT .

cd ../altinn-service
docker build -t martkvam/bachelor-altinn-service:0.0.1-SNAPSHOT .

cd ../case-service
docker build -t martkvam/bachelor-case-service:0.0.1-SNAPSHOT .

cd ../naming-server
docker build -t martkvam/bachelor-naming-server:0.0.1-SNAPSHOT .

cd ../docker
docker compose up

$SHELL

