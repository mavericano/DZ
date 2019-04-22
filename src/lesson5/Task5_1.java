package lesson5;

/*
Task
Имеется последовательность (массив) случайных чисел (ее можно генерировать с помощью Math.random() метода), найти и вывести наибольшее из них.
 */
public class Task5_1 {
    public static void main(String[] args) {
        double[] num = {0, 0, 0, 0, 0, 0};
        double max = 0;

        for (int i = 0; i < 6; i++) {
            num[i] = Math.random();
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Maximum value " + max);
    }
}
