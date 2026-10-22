package com.test.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemEntry {

    private final String name;
    private final List<FileSystemEntry> children;

    public Folder(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    @Override
    public int size() {
        return this.children.stream().map(FileSystemEntry::size).reduce(0, Integer::sum);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void print(String indentation) {
        System.out.printf("%s+ %s (%dB)\n", indentation, name, size());
        this.children.forEach(it -> it.print(indentation + "  "));
    }

    public void addChild(FileSystemEntry entry) {
        this.children.add(entry);
    }

}
