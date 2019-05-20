package by.pvt.lesson16;

import java.util.Random;

public class Main16 {

    public static void main(String[] args) {

        NumberPrinter numberPrinter = new NumberPrinter();

        numberPrinter.printNumber(new RandomIntGenerator() {
            @Override
            public Integer generate(int limit) {
                return new Random().nextInt(limit);
            }

        });

        numberPrinter.printNumber((limit) -> new Random().nextInt(limit));
        numberPrinter.printSum(
                j -> {
                    int res = 0;
                    for (int i = 0; i <= j; i++) res += i;
                    return res;
                },
                5
        );

    }

}
