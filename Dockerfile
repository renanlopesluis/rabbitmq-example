FROM openjdk:8
ADD build/libs/rabbitmq-example-docker.jar rabbitmq-example-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "rabbitmq-example-docker.jar"]