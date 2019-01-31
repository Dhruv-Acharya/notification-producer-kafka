package com.contest.notificationProducer.producer;

import com.contest.notificationProducer.dto.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionNoticeProducer implements Producer {
    @Autowired
    private KafkaTemplate<String, Header> kafkaTemplate;

    @Value("${subscriptionNotice.kafka.topic}")
    private String kafkaTopic;

    @Override
    public void send(Header header) {
        kafkaTemplate.send(kafkaTopic,header);
    }
}
