FROM openjdk:8-jdk-alpine
EXPOSE:8010
COPY target/drDetails.war drDetails.war
ENTRYPOINT["java","-war","drDetails.war"]

