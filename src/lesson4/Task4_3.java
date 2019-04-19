package lesson4;

import java.util.Scanner;

/*
Task
Используя цикл while, рассчитайте для введенного числа его факториал. Факториал числа n - это произведение всех натуральных чисел от 1 до n.
*/
public class Task4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you number");
        int currentModifier = 1;
        int n = in.nextInt();
        int ind = n;

        while (currentModifier < ind){
             n *= currentModifier;
             currentModifier++;
        }
        System.out.println("The solution for " + ind + " is " + n);
    }
}
