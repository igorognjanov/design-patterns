package com.test.structural.bridge;

public interface Device {

    void turnOn();

    void turnOff();

    void setVolume(int volume);
    int getVolume();

    boolean isEnabled();
}
