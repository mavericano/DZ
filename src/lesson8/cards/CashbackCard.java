package lesson8.cards;

public class CashbackCard extends Card{
    public double cashbackMult;

    public CashbackCard(double cashbackMult) {
        super();
        this.cashbackMult = cashbackMult;
    }

    public void calcCashback(){
        System.out.println("You will receive " + (sum * cashbackMult));
    }

    @Override
    public String toString() {
        return "CashbackCard{" +
                "cashbackMult=" + cashbackMult +
                ", sum=" + sum +
                '}';
    }
}
