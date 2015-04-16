Simplest possible webapp to demonstrate Cloudfoundry's java support. 

Build
=====
mvn package

Run Locally
===========
mvn spring-boot:run

or

MESSAGE="Modified test message" java -jar target/simple-java-webapp-0.0.1-SNAPSHOT.jar

Test
====
curl http://localhost:8080/test

Run on Cloudfoundry
===================
cf push

