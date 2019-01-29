package com.contest.notificationProducer.producer;

import com.contest.notificationProducer.dto.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class LikeProducer implements Producer {
    @Autowired
    private KafkaTemplate<String, Header> kafkaTemplate;

    @Value("${like.kafka.topic}")
    private String kafkaTopic;

    @Override
    public void send(Header header) {
        kafkaTemplate.send(kafkaTopic,header);
    }
}
