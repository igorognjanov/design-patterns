package com.test.structural.decorator;

public class DecoratorApplication {
    public static void main(String[] args) {
        HttpClient basicClient = new BasicHttpClient("/igor.ognjanov/Desktop");
        HttpClient client = new LoggingHttpClientDecorator(basicClient);

        basicClient.send();
        client.send();
    }
}
