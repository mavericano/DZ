package lesson7;

public class OutOfMemoryErr {
    static Item [] items = new Item[Integer.MAX_VALUE - Short.MAX_VALUE];

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {

        }
    }
}

class Item{
    long aLong;
    String string;

    public Item(long aLong, String string) {
        this.aLong = aLong;
        this.string = string;
    }
}
