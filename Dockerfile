# App build
FROM maven:3.9-eclipse-temurin-21 AS builder
WORKDIR /online-cinema
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Final image
FROM eclipse-temurin:21-jre-jammy
WORKDIR /online-cinema
COPY --from=builder /online-cinema/target/*.jar /online-cinema.jar
ENTRYPOINT ["java","-jar","/online-cinema.jar"]