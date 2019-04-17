package lesson4;

import java.util.Scanner;

public class Dustbin {
    public static void main(String[] args) {
        System.out.println("Please, type your command (insert money  [F] or make a foto [M]");
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();

        if("F".equals(command) || "M".equals(command)){
            System.out.println("Valid command " + command);
        } else {
            System.out.println("Err[01]: Invalid command " + command);
        }
    }
}
