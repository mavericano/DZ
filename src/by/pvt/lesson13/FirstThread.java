package by.pvt.lesson13;

public class FirstThread extends Thread{

    public FirstThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName() + thread.getState());
        System.out.println(thread.getName() + thread.isDaemon());
    }
}
