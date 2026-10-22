package com.test.structural.bridge;

public abstract class Remote {
    protected final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void toggleOnSwitch() {
        if (this.device.isEnabled()) {
            this.device.turnOff();
        } else {
            this.device.turnOn();
        }
    }

    void increaseVolume() {
        this.device.setVolume(this.device.getVolume() + 10);
    }

    void decreaseVolume() {
        var vol = this.device.getVolume();
        if (vol > 0) {
            this.device.setVolume(this.device.getVolume() - 10);
        }
    }
}
