package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.println("\n ======= TIPO DE NOTIFICAÇÃO ======= \n");
        System.out.println(" 1. Email \n 2. SMS \n 3. Push \n");
        System.out.println(" Escolha sua opção: ");
        str = scanner.nextLine();

        Notification notification = factory.createNotification(str);

        System.out.println(" Digite a mensagem para enviar: ");
        String message = scanner.nextLine();
        notification.send(message);
    }
}