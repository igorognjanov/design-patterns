package com.test.behavioral.chainofresponsibility;

public class InvalidEmailCounterMiddleware extends Middleware {

    public InvalidEmailCounterMiddleware() {}

    @Override
    public boolean check(String email, String password) {
        if (!email.contains("@")) {
            System.out.println("INVALID EMAIL");
            return false;
        } else return checkNext(email, password);
    }
}
