package com.test.behavioral.chainofresponsibility;

public abstract class Middleware {
    private Middleware next;

    public static Middleware setMiddleware(Middleware first, Middleware... chain) {
        var temp = first;
        for (var nextInChain : chain) {
            temp.setNext(nextInChain);
            temp = nextInChain;
        }
        return first;
    }

    public void setNext(Middleware middleware) {
        this.next = middleware;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (this.next == null) return true;
        return next.check(email, password);
    }
}
