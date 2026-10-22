package com.test.structural.flyweight;

public class FlyweightApplication {

    public static void main(String[] args) {
        var forest = new Forest();

        forest.plantTree(0, 0, "Bor", "zelen", "zimzeleno drvo");
        forest.plantTree(1, 0, "Smreka", "svetlozelena", "listopadno drvo");
        forest.plantTree(0,  1, "Vrba", "svetlozelena", "listopadno drvo");
        forest.plantTree(1,  1, "Smreka", "svetlozelena", "listopadno drvo");

        forest.drawTrees();

        TreeFactory.printTypes();

    }
}
