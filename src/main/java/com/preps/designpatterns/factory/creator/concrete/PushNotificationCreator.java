package com.preps.designpatterns.factory.creator.concrete;

import com.preps.designpatterns.factory.Notifiction;
import com.preps.designpatterns.factory.concrete.PushNotification;
import com.preps.designpatterns.factory.creator.NotificationCreator;

public class PushNotificationCreator extends NotificationCreator {

    @Override
    public Notifiction createNotification() {
        return new PushNotification();
    }
}
