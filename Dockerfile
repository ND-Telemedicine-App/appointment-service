FROM openjdk:11
EXPOSE 8090
COPY target/appointment-service-0.0.1-SNAPSHOT.jar appointment-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/appointment-service-0.0.1-SNAPSHOT.jar"]