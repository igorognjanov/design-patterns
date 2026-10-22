package com.test.structural.decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggingHttpClientDecorator extends HttpClientDecorator {

    protected LoggingHttpClientDecorator(HttpClient delegate) {
        super(delegate);
    }

    @Override
    public void send() {
        System.out.printf("[%s] Logging this activity...\n", LocalDateTime.now().format(DateTimeFormatter.ofPattern("mm:hh dd/MM/yyyy")));
        super.send();
    }
}
