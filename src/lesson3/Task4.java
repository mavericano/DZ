package lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's ur sum?");
        String text = in.nextLine();
        int sum = Integer.parseInt(text);

        if ((sum >= 5) & (sum <= 20)) {
            System.out.println(sum + " рублей");
        } else {
            switch (sum % 10) {
                case 1:
                    System.out.println(sum + " рубль");
                    break;
                case 2 : case 3: case 4 :
                    System.out.println(sum + " рубля");
                    break;
                case 5: case 6: case 7: case 8: case 9: case 0:
                    System.out.println(sum + " рублей");
                    break;
            }
        }
    }
}
