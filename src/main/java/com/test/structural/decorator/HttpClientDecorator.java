package com.test.structural.decorator;

public abstract class HttpClientDecorator implements HttpClient {
    private final HttpClient delegate;

    protected HttpClientDecorator(HttpClient delegate) {
        this.delegate = delegate;
    }

    @Override
    public void send() {
        this.delegate.send();
    }
}
