package lesson4;

import java.util.Scanner;

public class Dustbin {
    public static void main(String[] args) {
        System.out.println("Please, type your command (insert money  [F] or make a foto [M]");
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();

        switch(command){
            case "F":
                System.out.println("Smile!:)");
                break;
            case "M":
                System.out.println("Where are my money , Lebowski?");
            default :
                System.out.println("Err[01]: Invalid command");
        }
    }
}
