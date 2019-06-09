package by.pvt.lesson13.homework;

import java.util.List;

public class Customer implements Runnable{

    private List<String> goods;
    public Shop shop;
    public boolean isBeingServed;

    public Customer(List<String> goods, Shop shop) {
        this.goods = goods;
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            if (shop.isOpen) {
                shop.newCustomer(goods);
                System.out.println("New customer with demand " + goods);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
