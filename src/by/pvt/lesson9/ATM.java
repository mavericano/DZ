package by.pvt.lesson9;

public class ATM {

    public int ts;
    public int fs;
    public int hs;

    public ATM(int ts, int fs, int hs) {
        this.ts = ts;
        this.fs = fs;
        this.hs = hs;
    }

    int[] papers = new int[0];

    public void acceptPapers(int bnk) {
        int[] banknotes = new int[papers.length + 1];
        for (int i = 0; i < papers.length; i++) {
            banknotes[i] = papers[i];
        }
        banknotes[banknotes.length - 1] = bnk;
        papers = banknotes;
    }

    public void toMoneyBox(){
        for (int i = 0; i < papers.length; i++){
            switch (papers[i]) {
                case 20:
                    ts++;
                    break;

                case 50:
                    fs++;
                    break;

                case 100:
                    hs++;
                    break;
            }
        }
    }

    public boolean isAbleToWithdraw(int sum){
        if (((ts * 20 ) + (fs * 50) + (hs * 100)) < sum ) {
            return false;
        }

        return true;
    }
}
