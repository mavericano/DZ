package by.pvt.lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task10_1 {
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

        while (itr.hasNext()){
            Integer i = itr.next();
            if ((i == 2) || (i == 1) || (i == 0)){
                itr.remove();
            }
        }

        System.out.println(arrList);
    }
}
