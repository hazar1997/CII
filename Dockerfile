FROM openjdk:8
EXPOSE 8089
COPY CII/target/achat-1.0.jar achat.jar
ENTRYPOINT ["java","-jar","/achat.jar"]