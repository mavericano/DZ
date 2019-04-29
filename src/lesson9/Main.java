package lesson9;

public class Main {
    public static void main(String[] args) {
        Enum en = Enum.MONDAY;
        System.out.println(en.ordinal());
        System.out.println(en.MONDAY.getOrder());
    }
}
