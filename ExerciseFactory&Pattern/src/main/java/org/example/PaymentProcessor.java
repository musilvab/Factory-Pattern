package org.example;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentMethod) {
        this.paymentStrategy = paymentMethod;
    }

    void executePayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}
