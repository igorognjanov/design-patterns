package com.test.structural.adapter;

public class StripePaymentAdapter implements PaymentProcessor {

    private final StripePaymentApi stripePaymentApi;

    public StripePaymentAdapter(StripePaymentApi stripePaymentApi) {
        this.stripePaymentApi = stripePaymentApi;
    }

    @Override
    public void payment(int amount) {
        this.stripePaymentApi.pay(amount * 100);
    }
}
