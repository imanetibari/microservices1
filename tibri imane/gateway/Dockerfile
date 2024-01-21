FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /gateway
COPY ./src ./src
COPY ./pom.xml .
RUN mvn clean package

FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY --from=builder /gateway/${JAR_FILE} gateway.jar
ENTRYPOINT ["java","-jar","/gateway.jar"]