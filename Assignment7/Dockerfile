FROM openjdk:11.0.19-jdk
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install
