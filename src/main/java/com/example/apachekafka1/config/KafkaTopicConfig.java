package com.example.apachekafka1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {

    @Bean
    public NewTopic taiwoTopic(){
        return TopicBuilder.name("taiwo")
                .build();
    }
}
