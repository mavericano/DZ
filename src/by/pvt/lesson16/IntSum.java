package by.pvt.lesson16;

@FunctionalInterface
public interface IntSum {

    public int computeSum(int bound);


    default int getBound(){
        return 5;
    }
}
