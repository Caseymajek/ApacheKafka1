package com.example.apachekafka1.controller;

import com.example.apachekafka1.payload.Student;
import com.example.apachekafka1.producer.KafkaJsonProducer;
import com.example.apachekafka1.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    //private final KafkaProducer kafkaProducer;


//    @PostMapping
//    public ResponseEntity<String> sendMessage (@RequestBody String msg){
//        kafkaProducer.publishMessage(msg);
//        return ResponseEntity.ok("Message queued successfully");
//    }
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping("/json")
    public ResponseEntity<String> sendMessage (@RequestBody Student message){
        kafkaJsonProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully as Json");

    }

}
