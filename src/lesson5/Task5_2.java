package lesson5;

import java.util.Scanner;

/*
Task
Введите с клавиатуры любое число, следует подсчитать сумму всех цифр данного числа и вывести результат на экран.
 */
public class Task5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        String num = in.nextLine();
        char[] dig = num.toCharArray();
        int sum = 0;

        if (dig[0] == '-') {
            for (int i = 1; i < dig.length; i++) {
                if(!(dig[i] == '.')) {
                    sum += Integer.parseInt(Character.toString(dig[i]));
                }
            }
        } else{
            for (int i = 0; i < dig.length; i++) {
                if(!(dig[i] == '.')) {
                    sum += Integer.parseInt(Character.toString(dig[i]));
                }
            }
        }


        System.out.println("Solution " + sum);
    }
}
