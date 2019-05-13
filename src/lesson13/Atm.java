package lesson13;

public class Atm {

    private int count = 0;

    public synchronized int increment(){
        count++;
        return count;
    }

    public int decrement(){
        count--;
        return count;
    }

    public void reciept(){
        System.out.println(count);
    }

}
