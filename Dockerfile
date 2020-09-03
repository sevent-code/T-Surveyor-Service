##
## MAVEN JAR BUILD
##
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/surveyor-service/src
COPY pom.xml /home/app/surveyor-service
RUN mvn -f /home/app/surveyor-service/pom.xml clean package

##
## Compile App
##
FROM openjdk:8-jdk-alpine as builder
COPY --from=build /home/app/surveyor-service/target/*.jar /usr/app/surveyor-service.jar
EXPOSE 11111
ENTRYPOINT ["java", "-jar", "/usr/app/surveyor-service.jar"]
