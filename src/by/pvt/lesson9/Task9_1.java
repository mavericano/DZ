package by.pvt.lesson9;

import java.util.Scanner;

public class Task9_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Time t1 = new Time(458);
        Time t2 = new Time(4, 15, 68);

        System.out.println(t1.currentTime());
        System.out.println(t2.currentTime());
    }
}
