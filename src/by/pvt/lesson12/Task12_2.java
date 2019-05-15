package by.pvt.lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12_2 {
    public static void main(String[] args) {
        try {
            Pattern pattern = Pattern.compile("[0123456789]");
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("task12_1.txt"));
            String res = bufferedReader.readLine();

            while (res != null) {
                Matcher matcher = pattern.matcher(res);
                while (matcher.find()) {

                }
                res = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
