package lesson6;

import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        /*int [][] arr = {
                {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}
        };*/
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size");
        int a = in.nextInt();

        int [][] arr = new int[a][a];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
