package org.example;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os números do cartão: ");
        scanner.nextInt();

        System.out.println("Informe a senha do cartão: ");
        scanner.nextInt();

        System.out.println("Pagamento realizado com sucesso!");
    }
}
