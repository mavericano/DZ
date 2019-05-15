package by.pvt.lesson14;

import java.util.ArrayList;
import java.util.List;

public class Barbershop {

    private boolean isOpen;
    private boolean isBusy;

    private List<Integer> cash;
    private List<Parfume> parf;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    private String clientName;

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
        System.out.println(open ? "Opened" : "False");
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public void addMoneyToCash(int integer){
        if (cash == null) cash = new ArrayList<Integer>();
        cash.add(integer);
    }

    public void addParfume(List<Parfume> parfumes){
        if(parfumes == null) parfumes = new ArrayList<Parfume>();
        parf.addAll(parfumes);
    }

    public Parfume useParfume(){
        return parf.remove(0);
    }

    public synchronized void newClient(){
        try {
            String clientName = Thread.currentThread().getName();
            this.clientName = clientName;
            System.out.println("New client in the barbershop");
            while(isBusy){
                System.out.println("waitin'");
                Thread.sleep(1000);
            }
            this.clientName = clientName;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cut(){
        try {
            String barberName = Thread.currentThread().getName();
            this.setBusy(true);

            if (clientName != null){
                setBusy(true);
                System.out.println(barberName + " is serving " + clientName);
                Thread.sleep(2000);
                setBusy(false);
                this.clientName = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
