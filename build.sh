#/bin/bash

mvn clean install -DskipTests=true

# 删除旧的镜像
docker rmi -f `docker images | grep saas-kss | awk '{print $3}'`

docker-compose -f docker-compose.dev.yml build

