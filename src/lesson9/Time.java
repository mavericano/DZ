package lesson9;

public class Time {
    public int hour;
    public int min;
    public int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Time(int fullSec) {
        this.hour = fullSec / 3600;
        this.min = (fullSec - (hour * 3600)) / 60;
        this.sec = fullSec - (hour * 3600 + min * 60);
    }

    public int currentTime() {
        System.out.println(hour + " часов " + min + " минут " + sec + " секунд");
        return 0;
    }
}
