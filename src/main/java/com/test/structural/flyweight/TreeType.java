package com.test.structural.flyweight;

public class TreeType {

    private final String name;

    private final String color;
    private final String extraData;

    public TreeType(String name, String color, String extraData) {
        this.name = name;
        this.color = color;
        this.extraData = extraData;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getExtraData() {
        return extraData;
    }

    @Override
    public String toString() {
        return "TreeType{" +
            "name='" + name + '\'' +
            ", color='" + color + '\'' +
            ", extraData='" + extraData + '\'' +
            '}';
    }
}
