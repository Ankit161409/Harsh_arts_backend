FROM maven:3.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml . COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

<<<<<<< HEAD
EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]
=======
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
>>>>>>> 70a533c7a4f002a0a202ab6fa961b6d9690dda69
