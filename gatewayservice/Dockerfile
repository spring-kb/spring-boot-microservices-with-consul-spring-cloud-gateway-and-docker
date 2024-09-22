FROM openjdk:17

WORKDIR /app

COPY ./target/*.jar app.jar

EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]