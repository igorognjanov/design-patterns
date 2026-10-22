package com.test.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private final List<Tree> trees;

    public Forest() {
        this.trees = new ArrayList<>();
    }

    void plantTree(int x, int y, String name, String color, String treeExtraData) {
        this.trees.add(new Tree(x, y, TreeFactory.getTreeType(name, color, treeExtraData)));
    }

    void drawTrees() {
        for(var tree : this.trees) {
            System.out.println(tree);
        }
    }
}
