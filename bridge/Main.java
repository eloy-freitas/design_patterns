package bridge;

import bridge.control.Remote;
import bridge.devices.*;


public class Main {
    public static void main(String[] args) {
        Device d1 = new Radio();
        Remote r1 = new Remote(d1);

        r1.channelUp();
        r1.channelUp();
        r1.volumeDown();
        r1.volumeDown();
        r1.volumeDown();
        r1.volumeDown();

        System.out.println(d1.getVolume());

        // Device d2 = new Tv();

        // Remote r1 = new Remote(d2);

        // r1.volumeUp();
        // r1.volumeUp();
        // r1.volumeUp();
        // r1.volumeUp();
        // r1.volumeUp();
        // System.out.println(d2.getVolume());
    }   
}
