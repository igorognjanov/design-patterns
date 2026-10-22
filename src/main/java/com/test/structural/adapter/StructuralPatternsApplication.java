package com.test.structural.adapter;

public class StructuralPatternsApplication {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new StripePaymentAdapter(new StripePaymentApi());

        paymentProcessor.payment(60);

    }
}
