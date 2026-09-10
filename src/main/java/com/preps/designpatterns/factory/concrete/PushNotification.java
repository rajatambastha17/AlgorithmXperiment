package com.preps.designpatterns.factory.concrete;

import com.preps.designpatterns.factory.Notifiction;

public class PushNotification implements Notifiction {
    @Override
    public void send(String message) {
        System.out.println("Sending out push notifications.." + message);
    }
}
