package com.test.structural.bridge;

public class Tv implements Device {

    private boolean on;
    private int volume;

    @Override
    public void turnOn() {
        this.on = true;
        System.out.println("TV turned on\n");
    }

    @Override
    public void turnOff() {
        this.on = false;
        System.out.println("TV turned off\n");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.printf("TV volume set to %d\n", this.volume);
    }
    @Override
    public int getVolume() {
        return this.volume;
    }


    @Override
    public boolean isEnabled() {
        return this.on;
    }
}
