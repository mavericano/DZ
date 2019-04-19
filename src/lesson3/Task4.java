package lesson3;
/*
Task
Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
Используйте if и else, a так же класс java.io.Console для ввода значений целого числа.
 */
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
