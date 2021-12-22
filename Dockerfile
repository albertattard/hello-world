FROM openjdk:17-jdk-oracle
WORKDIR "/opt/application"
COPY "build/libs/hello-world-all.jar" "application.jar"
ENTRYPOINT ["java", "-jar", "application.jar"]
