# Stage 1: Build
FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:17-jre

WORKDIR /app
COPY --from=builder /app/target/*.jar api-gateway.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
