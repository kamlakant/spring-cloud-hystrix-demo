# Spring Cloud Hystrix Demo
Demo of fault tolerance by implementing circuit breaker pattern with Spring Cloud Hystrix

## Running the Microservices

1. Navigate to `alice-service` directory.
2. Open a terminal and execute below command to start ALICE service.
```
mvn spring-boot:run -Dserver.port=9001
```
3. Navigate to `bob-service` directory.
4. Open a terminal and execute below command to start BOB service.
```
mvn spring-boot:run -Dserver.port=10001
```
5. Open browser and go to `http://localhost:9001/get-bob-stuff/` to fetch data from BOB service into ALICE service. Notice that the response `Here is some random stuff from Bob` comes from Bob service.
6. Go to terminal and stop Bob service. Repeat step 5 and notice that the response `Bob's dead. Here is some default content` comes from the fallback method because killing Bob opened the circuit.
7. The same will work if Alice is dead and Bob sends a request to Alice.