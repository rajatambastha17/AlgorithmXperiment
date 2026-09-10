package com.preps.designpatterns.factory;

import com.preps.designpatterns.factory.creator.NotificationCreator;
import com.preps.designpatterns.factory.creator.concrete.EmailNotificationCreator;

public class Runner {
    public static void main(String[] args) {
        Notifiction nt = (message) -> System.out.println("This is send " + message);
        NotificationCreator notificationCreator;
//        Email Notification
        notificationCreator = new EmailNotificationCreator();
        notificationCreator.send("Sending via email");
    }
}
