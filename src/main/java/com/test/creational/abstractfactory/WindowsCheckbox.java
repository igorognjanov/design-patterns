package com.test.creational.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows checkbox rendering");
    }
}
