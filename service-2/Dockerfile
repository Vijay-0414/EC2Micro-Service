FROM openjdk:17-jdk

ARG JAR_FILE=target/*.jar

WORKDIR /app

COPY ${JAR_FILE} service2.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/service2.jar"]
