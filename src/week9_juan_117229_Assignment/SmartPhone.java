package week9_juan_117229_Assignment;

public class SmartPhone extends Device implements Power, VolumeControl, Device.Connectivity {

    private int currentVolume;
    private String connectedNetwork;
    private boolean isOn;

    public SmartPhone(String brand, String model) {
        super(brand, model);
        this.currentVolume = 0;
        this.connectedNetwork = null;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            System.out.println("Turning on the device...");
            isOn = true;
        } else {
            System.out.println("Device is already on.");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            System.out.println("Turning off the device...");
            isOn = false;
        } else {
            System.out.println("Device is already off.");
        }
    }

    @Override
    public void increaseVolume(int level) {
        currentVolume += level;
        System.out.println("Increasing volume by " + level + " levels.");
    }

    @Override
    public void decreaseVolume(int level) {
        currentVolume -= level;
        if (currentVolume < 0) currentVolume = 0;
        System.out.println("Decreasing volume by " + level + " levels.");
    }

    @Override
    public void connectToWiFi(String networkName) {
        connectedNetwork = networkName;
        System.out.println("Connecting to WiFi: " + networkName);
    }

    @Override
    public void disconnectFromWiFi() {
        if (connectedNetwork != null) {
            System.out.println("Disconnecting from WiFi...");
            connectedNetwork = null;
        } else {
            System.out.println("No WiFi network connected.");
        }
    }
}
