package com.redhat.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
@ImportResource({"classpath:spring/camel-context.xml"})
public class SpringBootAmqpConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAmqpConsumerApplication.class, args);
    }

}
