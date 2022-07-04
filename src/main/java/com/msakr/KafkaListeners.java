package com.msakr;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "msakr", groupId = "groupId123")
    void listener(String data) {
        System.out.println("Listener received: "+ data);
    }
}
