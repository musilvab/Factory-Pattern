package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy{

    public static String gerarCodigo(){
        Random random = new Random();
        String code = "";

        for(int i = 0; i < 10; i++){
            code = code + random.nextInt(10);
        }
        return code;
    }

    @Override
    public void processPayment(double amount) {
        String code = gerarCodigo();
        System.out.println("Valor a pagar: " + amount);
        System.out.println("Número do boleto: " + code);
    }
}
