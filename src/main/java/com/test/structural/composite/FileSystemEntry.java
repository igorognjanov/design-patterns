package com.test.structural.composite;

public interface FileSystemEntry {

    int size();

    String name();

    void print(String indentation);
}
