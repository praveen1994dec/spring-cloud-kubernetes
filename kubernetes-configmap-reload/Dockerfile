FROM openjdk:8-jdk-alpine
MAINTAINER VIRAJLUKKA1
COPY ./target/*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar app.jar --info
