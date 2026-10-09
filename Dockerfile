# Stage 1 — Build the app
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml first (for dependency caching)
COPY demo/demo/pom.xml .

# Download dependencies
RUN mvn dependency:go-offline -B

# Copy source code
COPY demo/demo/src ./src

# Build the JAR (skip tests)
RUN mvn clean package -DskipTests

# ─────────────────────────────────────────
# Stage 2 — Run the app
FROM eclipse-temurin:21-jre-alpine

# Set working directory
WORKDIR /app

# Copy JAR from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]