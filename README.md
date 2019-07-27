## 项目结构

- config-server: 配置中心
 
- eureka-registry: 服务注册中心

- zuul-gateway: api网关

- data-import-service: 导入服务

- monitor: hystrix dashboard

- turbine-stream-service: turbine


## 环境配置

/etc/hosts

```text
127.0.0.1  config-server
127.0.0.1  eureka-registry
127.0.0.1  arangodb
127.0.0.1  zipkin
127.0.0.1  rabbitmq
```

## 运行
 
编译,制作docker镜像：

```
./build.sh
```


启动：

```
./start_all.sh
```


## 访问

[Zuul Gateway](http://localhost)

[访问zuul接口例子](http://localhost/zuul/data-import-service/findOne?surname=Stark)

[Eureka Dashboard](http://localhost:8761)

[Hystrix Dashboard](http://localhost:8100/monitor/hystrix)

[data-import-service Hystrix Stream](http://localhost:8000/data-import-service/actuator/hystrix.stream)

[RabbitMQ](http://localhost:15672/)

[ArangoDB](http://localhost:8529/)

[Zipkin](http://localhost:9411/zipkin/)

## 文档

[arangodbo crud](https://www.arangodb.com/tutorials/tutorial-sync-java-driver/)

[arangodbo-spring-data](https://github.com/arangodb/spring-data)

[hystrix](https://segmentfault.com/a/1190000012439580)
