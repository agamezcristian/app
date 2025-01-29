FROM eclipse-temurin:23.0.1_11-jre-alpine

WORKDIR /app

COPY ./build/libs/app-0.0.1-SNAPSHOT.jar .

ENV PROFILE=pdn

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app-0.0.1-SNAPSHOT.jar"]