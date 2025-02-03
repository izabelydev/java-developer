FROM eclipse-temurin:11-jdk

WORKDIR /src

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

RUN mvn package -DskipTests