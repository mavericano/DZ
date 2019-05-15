package by.pvt.lesson7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class OutOfMemoryErr {

    static List<Item> items = new ArrayList<>();


    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        for (int i = 0; i <= 10000000; i++) {
            items.add(new Item(i, String.valueOf(i)));
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }

}

class Item {
    long aLong;
    String string;

    public Item(long aLong, String string) {
        this.aLong = aLong;
        this.string = string;
    }
}
