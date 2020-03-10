# camel-amqp-spring-boot
## Background
This example demonstrates how to consume and produce messages from AMQ Broker via AMQP using Camel routes.

The application utilizes the Spring [`@ImportResource`](http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/ImportResource.html) annotation to load a Camel Context definition via a [camel-context.xml](src/main/resources/spring/camel-context.xml) file on the classpath.

## Building

The example can be built with

    mvn clean install
    

## Run

The example can be built with

    mvn spring-boot:run
