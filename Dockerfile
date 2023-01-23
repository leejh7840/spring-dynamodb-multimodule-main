FROM openjdk:17-oracle
EXPOSE 9000
VOLUME /main-app
ADD aws-dynamodb-multimodule-api-web/build/libs/aws-dynamodb-multimodule-api-web-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

