package by.pvt.lesson14;

public class Barber implements Runnable{

    private Barbershop barbershop;

    public Barber(Barbershop barbershop) {
        this.barbershop = barbershop;
    }

    @Override
    public void run() {
        try {
            barbershop.setOpen(true);
            while (true) {
                barbershop.cut();
                Thread.sleep(5000);
            }
            //barbershop.setOpen(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
