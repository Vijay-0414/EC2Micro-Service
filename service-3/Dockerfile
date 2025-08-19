FROM openjdk:17-jdk

ARG JAR_FILE=target/*.jar

WORKDIR /app

COPY ${JAR_FILE} service3.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "service3.jar"]
