package com.julianhusson.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "julianhusson", groupId = "groupId")
    void listener(String data){
        System.out.println("Linstener recevied: " + data);
    }
}
