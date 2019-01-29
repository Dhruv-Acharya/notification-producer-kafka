package com.contest.notificationProducer.producer;

import com.contest.notificationProducer.dto.Header;

public interface Producer {
    public void send(Header header);
}
