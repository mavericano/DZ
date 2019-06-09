package by.pvt.lesson16;

public class Printer {

    public void printMin(MinFinder minFinder){
        System.out.println("Min = " + minFinder.find());
    };
    public void printMax(MaxFinder maxFinder){
        System.out.println("Max = " + maxFinder.find());
    };
}
