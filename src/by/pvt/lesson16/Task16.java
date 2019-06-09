package by.pvt.lesson16;

import java.util.Random;
import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*20);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Printer printer = new Printer();

        printer.printMin(() -> {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min){min = arr[i];}
            }
            return  min;
        });
        printer.printMax(() -> {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max){max = arr[i];}
            }
            return max;
        });
    }

}
