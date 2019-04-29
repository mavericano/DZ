package lesson8;

public class BtSpeaker extends Speaker implements Pluggable{

    public String connectedDevice;

    public BtSpeaker() {
    }

    public void plug(){
        System.out.println("*Bluetooth speaker says*: Hello!");
    }

    public void unplug(){
        System.out.println("*Bluetooth speaker says*: Goodbye!");
    }

    public void connect(String connectedDevice){
        this.connectedDevice = connectedDevice;
        System.out.println(connectedDevice + " has connected!");
    }
}
