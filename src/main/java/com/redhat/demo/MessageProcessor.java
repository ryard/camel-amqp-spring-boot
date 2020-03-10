package com.redhat.demo;

import org.apache.camel.CamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.camel.Processor;
import org.apache.camel.Exchange;

import java.io.InputStream;
import java.util.Random;

public class MessageProcessor implements Processor {

    private static final Logger log = LoggerFactory.getLogger(MessageProcessor.class);

//    public InputStream generateOrder(CamelContext camelContext) {
//        Random random;
//
//        int number = random.nextInt(5) + 1;
//
//        String name = "data/order" + number + ".xml";
//
//        return camelContext.getClassResolver().loadResourceAsStream(name);
//    }

    @Override
    public void process(Exchange exchg) throws Exception {

    }


//
//    @JmsListener(destination = "MyQueue0")
//    public void processMsg(String message) {
//        log.info("============= Received: " + message);
//    }
}
