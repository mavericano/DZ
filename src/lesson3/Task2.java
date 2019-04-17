package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("what's ur number?");
        String text = in.nextLine();
        int number = Integer.parseInt(text);

        if(number > 0){
            if((number + 3) % 10 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        } else{
            if(number == 0){
                System.out.println("No");
            }else{
                if ((number - 3) % 10 == 0){
                    System.out.println("Yes");
                }
            }
        }
    }
}
