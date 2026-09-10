package com.preps.designpatterns.factory.concrete;

import com.preps.designpatterns.factory.Notifiction;

public class SMSNotification implements Notifiction {

    @Override
    public void send(String message) {
        System.out.println("Sending out sms notifications.." +  message);
    }
}
