FROM java:8-jre

ADD ./target/eureka-registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka-registry.jar"]

EXPOSE 8761