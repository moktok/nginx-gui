FROM maven:3.9.8-eclipse-temurin-17-alpine AS build

WORKDIR /build
COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17.0.11_9-jre-alpine
WORKDIR /app
COPY --from=build /build/target/java-web-tester.jar .
CMD ["java","-jar","java-web-tester.jar"]
