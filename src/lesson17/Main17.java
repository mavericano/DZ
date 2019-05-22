package lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main17 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }

        list.forEach(System.out::println);

        Stream<Integer> str = list.stream();
        str.max(Integer::compareTo);
    }

}
