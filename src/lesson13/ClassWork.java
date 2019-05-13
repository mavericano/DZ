package lesson13;

public class ClassWork {

    public static void main(String[] args) {
        new FirstThread("th1").start();
        new FirstThread("th2").start();
        new FirstThread("th3").start();
        new FirstThread("th1").start();
        SecondThread secondThread = new SecondThread();

        new Thread(secondThread).start();
    }

}
