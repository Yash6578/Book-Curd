FROM openjdk:18
EXPOSE 9090
COPY /target/bookApp.jar bookApp.jar
ENTRYPOINT [ "java", "-jar", "bookApp.jar"]