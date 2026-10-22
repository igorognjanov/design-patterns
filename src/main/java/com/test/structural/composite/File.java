package com.test.structural.composite;

public class File implements FileSystemEntry {

    private int size;
    private String name;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public void print(String indentation) {
        System.out.printf("%s- %s (%dB)\n", indentation, name, size);
    }
}
