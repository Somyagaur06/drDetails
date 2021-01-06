FROM openjdk:8-jdk-alpine
EXPOSE 8040
COPY drDetails/target/drDetails.war drDetails.war
ENTRYPOINT ["java","-war","drDetails.war"]

