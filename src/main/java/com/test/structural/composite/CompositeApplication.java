package com.test.structural.composite;

public class CompositeApplication {
    public static void main(String[] args) {
        Folder folder1 = new Folder("root");
        Folder folder2 = new Folder("user");
        Folder folder3 = new Folder("igor.ognjanov");
        Folder folder4 = new Folder("downloads");
        File file1 = new File("background.img", 4096);
        File file2 = new File("mountains.img", 1080);

        folder1.addChild(folder2);
        folder2.addChild(folder3);
        folder3.addChild(folder4);
        folder4.addChild(file1);
        folder4.addChild(file2);


        folder1.print("  ");
    }
}
