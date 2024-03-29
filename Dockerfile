FROM openjdk:17
COPY build/libs/demo-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/demo-0.0.1-SNAPSHOT.jar"]
