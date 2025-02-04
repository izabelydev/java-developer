FROM eclipse-temurin:11-jdk

RUN apt-get update && apt-get install -y maven

WORKDIR /src

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

RUN mvn package -DskipTests
