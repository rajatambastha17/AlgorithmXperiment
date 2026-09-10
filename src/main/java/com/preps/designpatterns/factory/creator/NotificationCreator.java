package com.preps.designpatterns.factory.creator;

import com.preps.designpatterns.factory.Notifiction;

public abstract class NotificationCreator {
    public abstract Notifiction createNotification();

    public void send(String message){
        Notifiction notifiction = createNotification();
        notifiction.send(message);
    }
}
