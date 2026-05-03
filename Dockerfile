# Stage 1: Build jar
FROM eclipse-temurin:22-jdk AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# Stage 2: Run jar
FROM eclipse-temurin:22-jre
WORKDIR /app
COPY --from=build /app/target/quiz-spring-boot-3.5.11.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
