FROM java:8
COPY /target/orders-0.0.1-SNAPSHOT.jar /data/
EXPOSE 9003
WORKDIR /data/
CMD ["java", "-jar", "orders-0.0.1-SNAPSHOT.jar"]
