package com.test.structural.adapter;

public class StripePaymentApi {

    public void pay(double cents) {
        System.out.printf("Stripe payment of %f cents", cents);
    }

}
