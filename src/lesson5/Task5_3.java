package lesson5;

import java.util.Scanner;

/*
Task
Имеется целое число, введенное в клавиатуры, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class Task5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Checked number?");
        int num = in.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Nope");
                System.exit(0);
            }
        }
        System.out.println("Yay");
    }
}
