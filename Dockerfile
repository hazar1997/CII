FROM openjdk:8
EXPOSE 8089
ADD CII/target/achat-1.0.jar.jar achat-1.0.jar
ENTRYPOINT ["java","-jar","/achat.jar"]