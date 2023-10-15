package com.houd.kafkacloud;


import org.springframework.messaging.MessageChannel;

public interface ProducerChannel {
    String OUTPUT = "producer-out";

    @Output(OUTPUT)
    MessageChannel output();
}
