package com.houd.kafkacloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaProducerController {

    @Autowired
    private ProducerChannel producerChannel;

    @PostMapping("/produce")
    public void sendMessageToKafkaTopic(@RequestParam String message) {
        producerChannel.output().send(MessageBuilder.withPayload(message).build());
    }
}
