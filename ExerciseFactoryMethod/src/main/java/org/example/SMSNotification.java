package org.example;

public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Você recebeu um SMS: " + message);
    }
}
