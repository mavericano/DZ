package lesson12;

public class Example {
    public static void main(String[] args) {
        Writer exmp = new Writer();
        exmp.writeToFile("Hello".getBytes(), "tmp.txt");
        exmp.writeToFile("Hello".getBytes(), "tmp.txt");

        System.out.println(new String(exmp.readFromFile("tmp.txt")));
        exmp.readStringFromFile("TODO.txt");
    }
}
