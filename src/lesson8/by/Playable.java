package lesson8.by;

public interface Playable {
    void playMusic();

    default void playMusic(int money){
        System.out.println("Omg, where did you keep this flute? *music plays*");
    }
}
