FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /taxeTnb
COPY ./src ./src
COPY ./pom.xml .
RUN mvn clean package

FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY --from=builder /taxeTnb/${JAR_FILE} taxeTnb.jar
ENTRYPOINT ["java","-jar","/taxeTnb.jar"]
