package lesson3;
/*
Task
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r.
Используйте класс java.io.Console для ввода значений a, b, r.
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text1 = in.nextLine();
        String text2 = in.nextLine();
        String text3 = in.nextLine();

        int r = Integer.parseInt(text1);
        int a = Integer.parseInt(text2);
        int b = Integer.parseInt(text3);

        if(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) < r*2){
            System.out.println("Nope");
        }else{
            System.out.println("Yep");
        }
    }
}
