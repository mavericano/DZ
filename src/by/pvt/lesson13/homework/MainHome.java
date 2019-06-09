package by.pvt.lesson13.homework;

import java.util.List;

public class MainHome {

    public static void main(String[] args) {

        Shop pyatorockka = new Shop();

        CashBoard c1 = new CashBoard(pyatorockka);
        CashBoard c2 = new CashBoard(pyatorockka);

        List<String> initGoods = List.of("Potatoes", "Carrot", "Water");

        Customer leha = new Customer(initGoods, pyatorockka);
        Customer sanya = new Customer(initGoods, pyatorockka);
        Customer sergey = new Customer(initGoods, pyatorockka);

        new Thread(c1, "cashboard 1").start();
        new Thread(c2, "cashboard 2").start();
        new Thread(leha, "Leha").start();
        new Thread(sanya, "Sanya").start();
        new Thread(sergey, "Sergey").start();
    }

}
