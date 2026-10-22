package com.test.behavioral.chainofresponsibility;

public class PasswordSameAsEmailCounterMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals(password)) {
            System.out.println("EMAIL AND PASSWORD ARE EQUAL");
            return false;
        } else {
            return checkNext(email, password);
        }
    }
}
