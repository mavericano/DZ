package lesson4;
/*
Task
Имеются три числа — день, месяц, год. Вывести в виде трех чисел дату следующего дня.
Постарайтесь испольщовать операторы if, else, или switch и не использовать стандартные классы JDK для работы с датами!
Помните про ввод данных в программу в виде строки String и затем конвертация в цифровое значение int.


 */

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("Day?");
            String day = in.nextLine();
            int d = Integer.parseInt(day);

            System.out.println("Month?");
            String month = in.nextLine();
            int m = Integer.parseInt(month);

            System.out.println("Year?");
            String year = in.nextLine();
            int y = Integer.parseInt(year);

            if (d == 31 & m == 12) {
                y++;
                System.out.println("1 1 " + y);
                continue;
            }

            switch (m) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 7:
                case 10:
                case 12:
                    if (d > 31 || d <= 0) {
                        System.out.println("Invalid day");
                    } else {
                        if (d + 1 == 32) {
                            System.out.println("1 " + (m + 1) + " " + y);
                        } else {
                            System.out.println(d + " " + m + " " + y);
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (d > 30 || d <= 0) {
                        System.out.println("Invalid date");
                    } else {
                        if (d + 1 == 30) {
                            System.out.println("1 " + (m + 1) + " " + y);
                        } else {
                            System.out.println(d + " " + m + " " + y);
                        }
                    }
                    break;
                case 2:
                    if (d > 29 || d <= 0) {
                        System.out.println("Invalid date");
                    } else {
                        if (d == 29) {
                            if ((((y % 4 == 0) && !(y % 100 == 0)) || (y % 400 == 0))) {
                                System.out.println(d + m + y);
                            } else {
                                System.out.println("Invalid date. This year is not leap!");
                            }
                        } else {
                            if (d + 1 == 29) {
                                System.out.println("1 " + (m + 1) + y);
                            } else {
                                System.out.println(d + " " + m + " " + y);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid date");
                    break;
            }
        }
    }
}
