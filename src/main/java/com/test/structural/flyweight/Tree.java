package com.test.structural.flyweight;

public class Tree {

    private final int x;
    private final int y;
    private final TreeType type;

    public Tree(int x, int y, TreeType type ) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tree{" +
            "x=" + x +
            ", y=" + y +
            ", type=" + type +
            '}';
    }
}
