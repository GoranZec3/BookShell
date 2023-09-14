FROM eclipse-temurin:17-jdk-alpine
VOLUME /temp
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080