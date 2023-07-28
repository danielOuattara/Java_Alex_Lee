package java_Intermediate._02_OOP;

public class Headphones {
    String chargeType = "micro usb";
    String[] controlsInput = {"power", "volume", "skip", "play/pause"};

    boolean powerStatus = false;
    int volume = 0;

    public void powerOn() {
        powerStatus = true;
    }

    public void powerOff() {
        powerStatus = false;
    }

    public void setVolumeUp() {
        volume++;
    }

    public void setVolumeDown() {
        volume--;
    }
}
