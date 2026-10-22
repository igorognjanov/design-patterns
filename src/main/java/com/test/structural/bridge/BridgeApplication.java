package com.test.structural.bridge;

public class BridgeApplication {
    public static void main(String[] args) {

        Device tv = new Tv();

        Remote basicRemote = new BasicRemote(tv);
        AdvancedRemote advancedRemote1 = new AdvancedRemote(tv);

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);

        basicRemote.toggleOnSwitch();
        basicRemote.increaseVolume();
        basicRemote.decreaseVolume();


        advancedRemote1.toggleOnSwitch();
        advancedRemote1.increaseVolume();
        advancedRemote1.decreaseVolume();
        advancedRemote1.mute();

        advancedRemote.toggleOnSwitch();
        advancedRemote.increaseVolume();
        advancedRemote.decreaseVolume();
        advancedRemote.mute();

    }
}
