package by.pvt.lesson12;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12_1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("task12_1.txt", true);
            fileOutputStream.write("testing 1 2 1 2 \n".getBytes());
            fileOutputStream.write("testing 22333322".getBytes());
            Pattern pattern = Pattern.compile("[,.!?;:]");
            Pattern word = Pattern.compile("[ ][\\w]");
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("task12_1.txt"));

            int i = 0; //счётчик знаков припинания
            int j = 0; //счётчик слов
            int s = 0; //счётчик строк
            String res = bufferedReader.readLine();

            while (res != null) {
                Matcher matcher = pattern.matcher(res);
                Matcher wordMatcher = word.matcher(res);
                while (matcher.find()) {
                    i++;
                }
                while (wordMatcher.find()){
                    j++;
                }
                if (!(res.equals(""))) s++;
                res = bufferedReader.readLine();
            }
            System.out.println(i);
            System.out.println(j + s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
