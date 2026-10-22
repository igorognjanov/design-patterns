package com.test.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    static Map<String, TreeType> types = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String treeExtraData) {
        if (!types.containsKey(name)) {
            var newType = new TreeType(name, color, treeExtraData);
            types.put(name, newType);
            return newType;
        }
        return types.get(name);
    }

    public static void printTypes(){
        for(var type : types.values()) {
            System.out.println(type);
        }
    }
}
