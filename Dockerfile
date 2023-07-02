FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /breej

COPY target/*.jar breej.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "breej.jar"]
