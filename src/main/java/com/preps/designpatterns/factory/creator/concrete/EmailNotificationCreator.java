package com.preps.designpatterns.factory.creator.concrete;

import com.preps.designpatterns.factory.Notifiction;
import com.preps.designpatterns.factory.concrete.EmailNotification;
import com.preps.designpatterns.factory.creator.NotificationCreator;

public class EmailNotificationCreator extends NotificationCreator {

    @Override
    public Notifiction createNotification() {
        return new EmailNotification();
    }
}
