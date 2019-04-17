package lesson3;

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

        if(Math.sqrt(a^2 + b^2) < r*2){
            System.out.println("Nope");
        }else{
            System.out.println("Yep");
        }
    }
}
