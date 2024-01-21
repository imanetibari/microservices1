FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /server
COPY ./src ./src
COPY ./pom.xml .
RUN mvn clean package

FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY --from=builder /server/${JAR_FILE} server.jar
ENTRYPOINT ["java","-jar","/server.jar"]