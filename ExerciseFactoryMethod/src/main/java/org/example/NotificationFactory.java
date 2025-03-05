package org.example;

public class NotificationFactory { // Aqui ele vai criar um objeto com base no parametro que passei no main
    Notification createNotification(String type){
        if(type.equalsIgnoreCase("email")){
            return new EmailNotification();
        } else if(type.equalsIgnoreCase("sms")){
            return new SMSNotification();
        } else if(type.equalsIgnoreCase("push")){
            return new PushNotification();
        } else {
          throw new IllegalArgumentException("Tipo inválido!"); // Se for algum tipo que não existe, ele retorna esse throw que aparece no console como um erro
        }
    }
}
