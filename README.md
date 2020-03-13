# camel-amqp-spring-boot
# Background
This example demonstrates how to consume and produce messages from AMQ Broker via AMQP using Camel routes.

The application utilizes the Spring [`@ImportResource`](http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/ImportResource.html) annotation to load a Camel Context definition via a [camel-context.xml](src/main/resources/spring/camel-context.xml) file on the classpath.

# Local Machine
## Building locally

The example can be built with

    # mvn clean install
    

## Running locally

The example can be built with

    # mvn spring-boot:run

# OpenShift
## Running on Openshift

- This example can make use of OpenShift Developer's portal: 

![OpenShift Developer's portal](https://user-images.githubusercontent.com/25560159/76614279-b10b6f00-655a-11ea-911b-8c79da2c8773.png)

- Create a secret on OpenShift console in the same namespace:

```
# oc secrets new client client.ts
```

- Mount the secret onto the workload using OpenShift Administrator's portal with the path */keystore*:

![OpenShift Administrator's portal](https://user-images.githubusercontent.com/25560159/76614458-13fd0600-655b-11ea-8c36-9cc91d5d216a.png)
