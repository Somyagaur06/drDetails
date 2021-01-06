FROM openjdk:8
EXPOSE 8080
COPY drDetails/target/drDetails.jar drDetails.jar
ENTRYPOINT ["java","-jar","drDetails.jar"]

