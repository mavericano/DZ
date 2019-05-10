package lesson9;

import lesson4.Banknote;

import java.util.Scanner;

public class Task9_2 {
    public static void main(String[] args) {
        boolean flag = true;
        ATM m1 = new ATM(0, 0, 0);

        while (flag) {
            System.out.println("Please, type your command (insert [A] or withdraw [W] money, [Q] to stop)");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();

            switch (command) {
                case "W":

                    break;

                case "A":
                    while (true) {
                        System.out.println("Where are my money , Lebowski? How much will u give me? [20] [50] [100]. Feel free to [stop] any time!");
                        String banknotes = in.nextLine();
                        int banknoteValue = 0;

                        if (banknotes.equals("stop")) {
                            break;
                        }

                        try {
                            banknoteValue = Integer.parseInt(banknotes);
                            switch (banknoteValue) {
                                case 20:
                                    banknoteValue = 20;
                                    break;
                                case 50:
                                    banknoteValue = 50;
                                    break;
                                case 100:
                                    banknoteValue = 100;
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("I don't need all those fakies!");
                        } finally {
                            if (banknoteValue == 0) {
                                System.out.println("Listen... I've saved you and I'm not going to play out charity!");
                            } else {
                                m1.acceptPapers(banknoteValue);
                            }
                        }
                    }
                    m1.toMoneyBox();
                    break;

                case "Q":
                    System.out.println("Goodbye my lover, goodbye my friend");
                    flag = false;
                    break;

                default:
                    System.out.println("Err[01]: Invalid command");
            }
        }
    }
}
