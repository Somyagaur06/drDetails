FROM openjdk:8
EXPOSE 8040
COPY drDetails/target/drDetails.war drDetails.jar
ENTRYPOINT ["java","-jar","drDetails.jar"]

