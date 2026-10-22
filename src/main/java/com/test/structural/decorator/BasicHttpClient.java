package com.test.structural.decorator;

public class BasicHttpClient implements HttpClient {
    private final String url;

    public BasicHttpClient(String url) {
        this.url = url;
    }

    @Override
    public void send() {
        System.out.printf("200 OK %s\n", url);
    }
}
