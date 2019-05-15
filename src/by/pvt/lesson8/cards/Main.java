package by.pvt.lesson8.cards;

public class Main {
    public static void main(String[] args) {
        Card visaGold = new Card();
        visaGold.addMoney(4.66);
        CashbackCard number1 = new CashbackCard(0.1);
        number1.calcCashback();
        DiscountCard halva = new DiscountCard(0.1, "Evroopt", 0.1);
        halva.checkDisc("Gippo");
        halva.checkDisc("Evroopt");
        visaGold.toString();
    }
}
