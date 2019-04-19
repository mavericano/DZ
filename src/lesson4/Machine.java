package lesson4;

public class Machine {

    Banknote[] papers = new Banknote[0];

    public void acceptPapers(Banknote bnk) {
        Banknote[] banknotes = new Banknote[papers.length + 1];
        for (int i = 0; i < papers.length; i++) {
            banknotes[i] = papers[i];
        }
        banknotes[banknotes.length - 1] = bnk;
        papers = banknotes;
    }

    public void countPapers() {
        int sum = 0;
        for (int i = 0; i < papers.length; i++) {
            sum += papers[i].value;
        }
        System.out.println("You've inserted " + sum);
    }
}
