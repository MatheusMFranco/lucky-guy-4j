FROM eclipse-temurin:22-jdk AS build
LABEL authors="matheusmagal"

RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

WORKDIR /app

COPY pom.xml ./

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:22-jre-alpine
WORKDIR /app

COPY --from=build /app/target/LuckyGuy4J-1.0.0.jar ./LuckyGuy4J.jar

CMD ["java", "-jar", "LuckyGuy4J.jar"]
