FROM java:8
COPY /target/ui-0.0.1-SNAPSHOT.jar /data/
EXPOSE 8080
WORKDIR /data/
CMD ["java", "-jar", "ui-0.0.1-SNAPSHOT.jar"]
