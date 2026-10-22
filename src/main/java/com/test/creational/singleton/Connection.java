package com.test.creational.singleton;

public class Connection {
    private final String url;

    public Connection(String url) {
        this.url = url;
    }

    public void query(String sql) {
        System.out.printf("%s %s", this.url, sql);
    }
}
