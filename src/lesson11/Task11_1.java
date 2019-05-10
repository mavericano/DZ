package lesson11;

public class Task11_1 {
    public static void main(String[] args) {
        String s1 = " ";
        StringBuilder s2 = new StringBuilder(" ");

        double t1 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            s1 += "1";
        }

        double t2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            s2.append("1");
        }

        double t3 = System.currentTimeMillis();

        System.out.println("Using String " + (t2 - t1));
        System.out.println("Using StringBuilder " + (t3 - t2));
    }
}