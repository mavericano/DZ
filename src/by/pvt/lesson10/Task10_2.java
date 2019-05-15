package by.pvt.lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task10_2 {
    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            arrList.add((int) (Math.random() * 6));
        }

        System.out.println(arrList);

        Iterator<Integer> itr = arrList.iterator();

        int max = 0;
        while (itr.hasNext()){
            Integer i = itr.next();
            if (i > max){
                max = i;
            }
        }

        System.out.println(max);
        System.out.println(arrList);
    }
}