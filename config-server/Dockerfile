FROM openjdk:8-alpine

ADD ./target/config-server.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config-server.jar"]

EXPOSE 8888
