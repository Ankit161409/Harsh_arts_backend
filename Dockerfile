# Stage 1 — Build
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app

# pom.xml copy karo
COPY pom.xml .

# Dependencies download karo
RUN mvn dependency:go-offline -B

# Source copy karo
COPY src ./src

# Build karo
RUN mvn clean package -DskipTests

# Stage 2 — Run
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]