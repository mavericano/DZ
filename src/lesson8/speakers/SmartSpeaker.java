package lesson8.speakers;

public class SmartSpeaker extends BtSpeaker implements Pluggable {
    public int currentAlarmH;
    public int currentAlarmM;

    public SmartSpeaker() {
    }

    public void plug(){
        System.out.println("*Smart speaker says*: Hello!");
    }

    public void unplug(){
        System.out.println("*Smart speaker says*: Goodbye!");
    }

    public void setAlarm(int newAlarmH, int newAlarmM) {
        currentAlarmH = newAlarmH;
        currentAlarmM = newAlarmM;
        System.out.println("The alarm was set for " + currentAlarmH + " hours " + currentAlarmM + " minutes");
    }
}
