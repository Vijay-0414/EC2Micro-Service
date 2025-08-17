FROM openjdk:17-jdk

ARG JAR_FILE=target/*.jar

WORKDIR /app

COPY ${JAR_FILE} service1.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/service1.jar"]
