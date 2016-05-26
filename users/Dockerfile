FROM java:8
COPY /target/users-0.0.1-SNAPSHOT.jar /data/
EXPOSE 9002
WORKDIR /data/
CMD ["java", "-jar", "users-0.0.1-SNAPSHOT.jar"]
