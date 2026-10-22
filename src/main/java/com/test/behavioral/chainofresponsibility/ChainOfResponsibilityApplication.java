package com.test.behavioral.chainofresponsibility;

import java.util.Iterator;

public class ChainOfResponsibilityApplication {

    public static void main(String[] args) {
        var middleware = Middleware.setMiddleware(
            new InvalidEmailCounterMiddleware(),
            new PasswordSameAsEmailCounterMiddleware()
        );

        var iterator = Iterator
        middleware.check("igorognjanovsorsix.com", "test");
        middleware.check("igorognjanov@sorsix.com", "igorognjanov@sorsix.com");
        middleware.check("igorognjanov@sorsix.com", "test");


    }
}
