package com.contest.notificationProducer.notificationEnum;

public enum NotificationType {
    COMMENT(0),
    CONTEST(1),
    FOLLOW(2),
    GENERIC(3),
    LIKE(4),
    QUESTIONS_ADDED(5),
    RESULT(6),
    SHARE(7),
    SUBSCRIPTION_NOTICE(8),
    WELCOME(9);

    final int value;

    NotificationType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
