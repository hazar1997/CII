FROM openjdk:8
EXPOSE 8089
ADD https://github.com/hazar1997/CII/blob/hazar/target/achat-1.0.jar achat-1.0.jar
ENTRYPOINT ["java","-jar","/achat-1.0.jar"]