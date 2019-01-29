package com.contest.notificationProducer.dto;


import com.contest.notificationProducer.notificationEnum.NotificationMedium;
import com.contest.notificationProducer.notificationEnum.NotificationType;

public class Header {
    private NotificationType notificationType;
    private String receiver;
    private String timeStamp;
    private NotificationMedium notificationMedium;
    private NotificationTypeBody notificationTypeBody;

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public NotificationMedium getNotificationMedium() {
        return notificationMedium;
    }

    public void setNotificationMedium(NotificationMedium notificationMedium) {
        this.notificationMedium = notificationMedium;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public NotificationTypeBody getNotificationTypeBody() {
        return notificationTypeBody;
    }

    public void setNotificationTypeBody(NotificationTypeBody notificationTypeBody) {
        this.notificationTypeBody = notificationTypeBody;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Header{");
        sb.append("notificationType=").append(notificationType);
        sb.append(", receiver='").append(receiver).append('\'');
        sb.append(", timeStamp='").append(timeStamp).append('\'');
        sb.append(", notificationMedium=").append(notificationMedium);
        sb.append(", notificationTypeBody=").append(notificationTypeBody);
        sb.append('}');
        return sb.toString();
    }
}
