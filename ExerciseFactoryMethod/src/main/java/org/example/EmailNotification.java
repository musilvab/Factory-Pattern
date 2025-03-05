package org.example;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Você recebeu um email: " + message);
    }
}
