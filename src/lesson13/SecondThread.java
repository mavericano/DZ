package lesson13;

public class SecondThread implements Runnable{



    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
        System.out.println(thread.isDaemon());
    }
}
