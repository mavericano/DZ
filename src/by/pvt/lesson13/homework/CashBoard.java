package by.pvt.lesson13.homework;

public class CashBoard implements Runnable{

    public Shop shop;

    public CashBoard(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.isOpen = true;
            while (true) {
                shop.service();
                //Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
