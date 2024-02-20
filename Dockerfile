FROM openjdk:17
COPY build/libs/demo-0.0.1-SNAPSHOT.jar /test/
CMD ["java","-jar", "/test/demo-0.0.1-SNAPSHOT.jar"]