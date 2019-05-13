package lesson13;

public class ClassWork2 {
    public static void main(String[] args) {
        try {
            Atm atm = new Atm();

            new Thread(new Cashier(atm), "c1").start();
            new Thread(new Cashier(atm), "c2").start();

            Thread.sleep(15000);
            atm.reciept();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
