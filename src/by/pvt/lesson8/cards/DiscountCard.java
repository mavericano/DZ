package by.pvt.lesson8.cards;

public class DiscountCard extends CashbackCard {
    public String discPlace;
    public double discMult;

    public DiscountCard(double cashbackMult, String discPlace, double discMult) {
        super(cashbackMult);
        this.discPlace = discPlace;
        this.discMult = discMult;
    }

    public void checkDisc(String currentPlace){
        if (currentPlace.equals(discPlace)){
            System.out.println("Your discount is " + (discMult * 100) + "%");
        } else{
            System.out.println("You have no discount here!");
        }
    }

    @Override
    public String toString() {
        return "DiscountCard{" +
                "discPlace='" + discPlace + '\'' +
                ", discMult=" + discMult +
                ", cashbackMult=" + cashbackMult +
                ", sum=" + sum +
                '}';
    }
}
