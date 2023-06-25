FROM maven:3.8.4-openjdk-11-slim
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install
ENTRYPOINT ["java", "-jar", "target/Assignment7-1.0-SNAPSHOT.jar"]