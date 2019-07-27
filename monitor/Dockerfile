FROM openjdk:8-alpine

ADD ./target/monitor.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/monitor.jar"]

EXPOSE 8100