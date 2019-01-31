package com.contest.notificationProducer.producer;

import com.contest.notificationProducer.dto.Header;
import com.contest.notificationProducer.exception.FieldsCanNotBeEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ResultProducer implements Producer {
    @Autowired
    private KafkaTemplate<String, Header> kafkaTemplate;

    @Value("${result.kafka.topic}")
    private String kafkaTopic;

    @Override
    public void send(Header header) throws FieldsCanNotBeEmpty {

        if(header == null)
            throw new FieldsCanNotBeEmpty("Header Cannot Be Empty");

        if(header.getReceiver() == null || header.getNotificationMedium() == null || header.getNotificationType() == null ||
                header.getNotificationTypeBody() == null || header.getTimeStamp() == null)
            throw new FieldsCanNotBeEmpty("Header Fields Cannot Be Empty");



        kafkaTemplate.send(kafkaTopic,header);
    }
}
