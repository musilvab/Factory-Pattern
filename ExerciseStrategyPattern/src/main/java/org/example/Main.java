package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        double value;
        PaymentStrategy paymentStrategy;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ======== Forma de Pagamento ======== \n");
        System.out.println(" 1. Pix \n 2. Cartão de Crédito \n 3. Boleto \n");
        System.out.println(" Escolha a opção: ");
        opc = scanner.nextInt();

        System.out.println(" Informe o valor a pagar: ");
        value = scanner.nextDouble();

        switch (opc){
            case 1 :
                paymentStrategy = new PixPayment();
                break;
            case 2 :
                paymentStrategy = new CreditCardPayment();
                break;
            case 3 :
                paymentStrategy = new BoletoPayment();
                break;
            default:
                System.out.println(" Opção invalida!");
                return;
        }

        PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
        processor.executePayment(value);
    }
}