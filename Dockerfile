# Etapa 1: Construção da aplicação
FROM maven:3.8.4-openjdk-21-slim AS builder

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Imagem final
FROM openjdk:21-slim

WORKDIR /app
COPY --from=builder /app/target/seguranca-1.0.jar app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]