package com.preps.designpatterns.factory.creator.concrete;

import com.preps.designpatterns.factory.Notifiction;
import com.preps.designpatterns.factory.concrete.SMSNotification;
import com.preps.designpatterns.factory.creator.NotificationCreator;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notifiction createNotification() {
        return new SMSNotification();
    }
}
