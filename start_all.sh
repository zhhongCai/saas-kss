#/bin/bash

echo "starting config-server..."
docker-compose up -d config-server

echo "wait 10s..."
sleep 10
echo "starting eureka-registry..."
docker-compose up -d eureka-registry

echo "wait 10s..."
sleep 10
echo "starting arnagodb..."
docker-compose up -d arangodb

echo "wait 5s..."
sleep 5
echo "starting zipkin..."
docker-compose up -d zipkin

echo "starting rabbitmq..."
docker-compose up -d rabbitmq

echo "wait 10s..."
sleep 10
echo "starting data-import-service..."
docker-compose up -d data-import-service

echo "starting zuul-gateway..."
docker-compose up -d zuul-gateway

echo "starting monitor..."
docker-compose up -d monitor

echo "starting turbine-stream-service..."
docker-compose up -d turbine-stream-service