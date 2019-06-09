package by.pvt.lesson13.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public boolean isBusy;
    public boolean isOpen;

    public List<String> customerName = new ArrayList<String>();
    public List<String> goods;

    public synchronized void newCustomer(List<String> goods){
        try {
            String customerName = Thread.currentThread().getName();
            this.customerName.add(customerName);
            this.goods = goods;
            System.out.println("New customer in the shop");
            while(isBusy){
                System.out.println("waitin'");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void service(){

        if (!customerName.isEmpty()){
            String cashBoardName = Thread.currentThread().getName();
            isBusy = true;
            System.out.println(cashBoardName + " is serving " + customerName.get(0));
            for (String i:goods) {
                System.out.println(i);
            }
            isBusy = false;
            this.customerName.remove(0);
        }
    }
}
