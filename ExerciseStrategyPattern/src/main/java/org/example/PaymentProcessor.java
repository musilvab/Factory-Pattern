package org.example;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void executePayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}
