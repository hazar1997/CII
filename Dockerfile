FROM openjdk:8
EXPOSE 8080
ADD target/devops-integration.jar achat.jar
ENTRYPOINT ["java","-jar","/achat.jar"]