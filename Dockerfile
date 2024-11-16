FROM openjdk:21-slim as build
MAINTAINER Tolulope_Oredein
EXPOSE 8081
COPY target/purchase-electricity-0.0.1-SNAPSHOT.jar purchase-electricity-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/purchase-electricity-0.0.1-SNAPSHOT.jar"]
