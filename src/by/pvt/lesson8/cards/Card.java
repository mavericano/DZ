package by.pvt.lesson8.cards;

public class Card {
    public double sum;

    public Card() {
        sum = 0;
    }

    public void addMoney(double sum){
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Card{" +
                "sum=" + sum +
                '}';
    }
}
