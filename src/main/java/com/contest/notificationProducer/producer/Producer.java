package com.contest.notificationProducer.producer;

import com.contest.notificationProducer.dto.Header;
import com.contest.notificationProducer.exception.FieldsCanNotBeEmpty;

public interface Producer {
    public void send(Header header) throws FieldsCanNotBeEmpty;
}
