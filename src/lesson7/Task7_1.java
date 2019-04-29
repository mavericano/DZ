package lesson7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string");
        String tar = in.nextLine();
        Pattern pattern = Pattern.compile("[,.!?;:]");
        Matcher matcher = pattern.matcher(tar);
        int i = 0;

        while(matcher.find()){
            i++;
        }

        System.out.println("Answer is " + i);
    }
}
