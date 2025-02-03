FROM openjdk:19-jdk-alpine
COPY ./src /usr/flight-serach-api/src
COPY ./pom.xml /usr/flight-serach-api/pom.xml
COPY ./mvnw /usr/flight-serach-api/mvnw
COPY ./.mvn /usr/flight-serach-api/.mvn

WORKDIR /usr/flight-serach-api
RUN ./mvnw package
CMD ["java", "-jar", "target/FlightSearch-0.0.1-SNAPSHOT.jar"]