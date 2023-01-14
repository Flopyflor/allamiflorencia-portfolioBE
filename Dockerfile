FROM eclipse-temurin:latest
LABEL mantainer="allamiflorencia.com"
ADD target/Portfolio-0.0.1-SNAPSHOT.jar Portfolio-0.0.1-SNAPSHOT.jar
COPY target/Portfolio-0.0.1-SNAPSHOT.jar Portfolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/Portfolio-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080