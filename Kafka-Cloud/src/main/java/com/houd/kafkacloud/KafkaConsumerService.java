package com.houd.kafkacloud;

import org.springframework.stereotype.Service;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@EnableBinding(Sink.class)
@Service
public class KafkaConsumerService {

    @StreamListener(Sink.INPUT)
    public void handleMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
