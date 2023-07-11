package com.github.PerseuAlves.kafkaexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping("/producer")
    public <T> void producer(@RequestBody T message) {
        kafkaTemplate.send("ecommerce.client", message);
    }
}
