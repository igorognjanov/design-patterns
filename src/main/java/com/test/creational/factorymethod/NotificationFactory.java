package com.test.creational.factorymethod;

public abstract class NotificationFactory {

    public abstract Notification createNotification();

    public void sendNotification() {
        this.createNotification().notifyUser();;
    }

}
