package by.pvt.lesson16;

public class NumberPrinter {

    public void printNumber(RandomIntGenerator intGenerator){
        System.out.println(intGenerator.generate(100));
    }

    public void printSum(IntSum intSum, int bound){
        System.out.println(intSum.computeSum(bound));
    }

}
