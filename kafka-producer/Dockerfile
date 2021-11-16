FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} producer-app.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","/producer-app.jar"]