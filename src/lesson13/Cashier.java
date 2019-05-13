package lesson13;

public class Cashier implements Runnable{

    private Atm atm;

    public Cashier(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            try {
                Thread.sleep(1000);
                atm.increment();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
