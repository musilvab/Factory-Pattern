package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        double value;

        PaymentFactory paymentFactory = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ======== Forma de Pagamento ======== \n");
        System.out.println(" 1. Pix \n 2. Cartão de Crédito \n 3. Boleto \n");
        System.out.println(" Escolha a opção: ");
        opc = scanner.nextInt();

        System.out.println(" Informe o valor a pagar: ");
        value = scanner.nextDouble();


        PaymentStrategy paymentMethod = PaymentFactory.createPaymentMethod(opc);
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethod);
        paymentProcessor.executePayment(value);


    }
}