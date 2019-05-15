package by.pvt.lesson12;

import java.io.*;

class Car implements Serializable {


    int price;
    String name;

    static int year;
}

public class SerialExample {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("car.serial"));

             Car car1 = new Car();
             car1.name = "BMW X6";
             car1.price = 150000;
             car1.year = 2016;
             objectOutputStream.writeObject(car1);
             objectOutputStream.flush();
             objectOutputStream.close();

            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("car.serial"));
            Object obj = objectInputStream.readObject();
            Car car2 = (Car) obj;
        } catch (Exception e){
        }
    }
}
