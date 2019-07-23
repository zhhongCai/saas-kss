FROM openjdk:8-alpine

ADD ./target/data-import-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/data-import-service.jar"]

EXPOSE 6000