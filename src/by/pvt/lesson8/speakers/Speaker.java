package by.pvt.lesson8.speakers;

public class Speaker implements Pluggable {

    public int songNum;

    public Speaker() {
    }

    public void playMusic(int songNum){
        this.songNum = songNum;
        System.out.println("*song " + songNum + " started to play*");
    }

    public void plug(){
        System.out.println("*speaker says*: Hello!");
    }

    public void unplug(){
        System.out.println("*speaker says*: Goodbye!");
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "songNum=" + songNum +
                '}';
    }
}
