package lesson4;

import java.util.Scanner;

public class Dustbin {
    public static void main(String[] args) {
        int credit = 0;
        boolean flag = true;
        Machine m1 = new Machine();

        while (flag) {
            System.out.println("Please, type your command (insert money  [F] or make a foto [M]");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();

            switch (command) {
                case "SystemInfo":
                    System.out.println("You want the truth? You can't handle the truth!");
                    String reply = in.nextLine();
                    if (reply.equals("I pledge to follow the first rule of The Fight Club!")){
                        System.out.println("Film-talking foto-machine, 2019");
                        System.out.println("All rights are reserved");
                        System.out.println("Do not hesitate to tell your friends about it");
                    }
                    break;
                case "F":
                    if (credit > 0) {
                        System.out.println("Smile!:)");
                        credit--;
                    } else {
                        System.out.println("Err[02]: Not enough money");
                    }
                    break;
                case "M":
                    System.out.println("Where are my money , Lebowski? How much will u give me?");
                    String banknotes = in.nextLine();
                    int bankNum = 0;
                    try {
                        bankNum = Integer.parseInt(banknotes);

                    } catch(Exception e) {
                    }finally{
                        if (bankNum == 0){
                            System.out.println("I don't need all those fakies!");
                        } else {
                            m1.countPapers(bankNum);
                        }
                    }
                    //m1.countPapers(bankNum);
                    credit += bankNum;
                    break;
                case "Q":
                    System.out.println("Goodbye my lover, goodbye my friend");
                    flag = false;
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Err[01]: Invalid command");
            }
        }
    }
}
