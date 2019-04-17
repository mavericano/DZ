package lesson4;

import java.util.Scanner;

public class Dustbin {
    public static void main(String[] args) {
        int credit = 0;
        while(true) {
            System.out.println("Please, type your command (insert money  [F] or make a foto [M]");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();

            switch (command) {
                case "F":
                    if (credit > 0) {
                        System.out.println("Smile!:)");
                        credit--;
                    } else {
                        System.out.println("Err[02]: Not enough money");
                    }
                    break;
                case "M":
                    System.out.println("Where are my money , Lebowski?");
                    credit++;
                    break;
                case "Q":
                    System.out.println("Goodbye my lover, goodbye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Err[01]: Invalid command");
            }
        }
    }
}
