FROM java:8
COPY /target/products-0.0.1-SNAPSHOT.jar /data/
EXPOSE 9001
WORKDIR /data/
CMD ["java", "-jar", "products-0.0.1-SNAPSHOT.jar"]
