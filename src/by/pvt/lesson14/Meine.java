package by.pvt.lesson14;

import java.util.ArrayList;
import java.util.List;

public class Meine {

    public static void main(String[] args) {

        try {
            Barbershop cutX = new Barbershop();
            List<Parfume> initialParfumes = new ArrayList<>(List.of(
                    new Parfume("p1"),
                    new Parfume("p2"),
                    new Parfume("p3")));
            //cutX.addParfume(initialParfumes);

            Barber sanya = new Barber(cutX);
            Client leha = new Client(cutX);

            new Thread(sanya).start();
            new Thread(leha).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
