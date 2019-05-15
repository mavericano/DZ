package by.pvt.lesson5;

import java.util.Scanner;

/*
Task
Имеется целое число, следует вывести его в бухгалтерском формате. Т.е. начиная справа каждые три позиции отделяются пробелом.
Например, число 20023143 должно быть выведено как 20 023 143. (Не использовать классы и методы форматирования чисел из JDK!)
 */
public class Task5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your number is?");
        String num = in.nextLine();

        double tmp1 = Double.parseDouble(num);
        long tmp2 = (long) tmp1;

        num = String.valueOf(tmp2);

        char[] dig = num.toCharArray();
        int tmp = dig.length - 1;
        int i = 0;
        String fin = "";

        while (i < dig.length) {
            if (tmp % 3 == 0) {
                fin += dig[i];
                fin += " ";
                //System.out.print(" ");
                i++;
            } else {
                fin += dig[i];
                i++;
            }
            tmp--;
        }
        //char[] dig2 = fin.toCharArray();
        System.out.println(fin);
    }
}
