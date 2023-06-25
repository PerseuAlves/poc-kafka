package com.github.PerseuAlves.kafkaexample.client;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "ecommerce.client", groupId = "ecommerce-groupId")
    public void consumer(String message) {
        System.out.println(message);
    }
}
