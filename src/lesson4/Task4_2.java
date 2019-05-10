package lesson4;
/*
Task
Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить помещаются ли эти дома на данном участке.
Стороны домов — параллельны сторонам участка, в остальном размещение может быть любым.
 */

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first house sizes one by one");
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println("Enter second house sizes one by one");
            int c = in.nextInt();
            int d = in.nextInt();


            System.out.println("Enter land sizes one by one");
            int e = in.nextInt();
            int f = in.nextInt();

            if ((a == 0) || (b == 0) || (c == 0) || (d == 0) || (e == 0) || (f == 0)){
                System.out.println("Invalid data");
            }

            int min1 = Math.min(a, b);
            int max1 = Math.max(a, b);
            int min2 = Math.min(c, d);
            int max2 = Math.max(a, b);
            int minLand = Math.min(e, f);
            int maxLand = Math.max(e, f);


            if (e * f < (a * b + c * d)) {
                System.out.println("Not enough space");
                continue;
            }

            if (min1 + min2 < minLand & max1 + max2 < maxLand) {
                System.out.println("Not enough space");
                continue;
            }

            if ((min1 > minLand || min2 > minLand) || (max1 > maxLand || max2 > maxLand)) {
                System.out.println("Not enough space");
                continue;
            }
            System.out.println("Yee! It'll do!");
            break;
        }
    }
}
