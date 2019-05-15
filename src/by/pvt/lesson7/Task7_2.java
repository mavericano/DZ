package by.pvt.lesson7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string");
        String tar = in.nextLine();
        tar = tar.trim();
        Pattern pattern = Pattern.compile("[ ][\\w]");
        Matcher matcher = pattern.matcher(tar);
        int i = 0;

        while(matcher.find()){
            i++;
        }

        System.out.println("Answer is " + (i + 1));
    }
}
