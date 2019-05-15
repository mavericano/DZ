package by.pvt.lesson8.by;

public class Auto extends Machine implements Playable {
    public void drive() {
        System.out.println("Auto is driving");
    }

    @Override
    public void playMusic(){
        System.out.println("*music plays*");
    }
}
