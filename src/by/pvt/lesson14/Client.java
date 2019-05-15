package by.pvt.lesson14;

public class Client implements Runnable{

    private Barbershop barbershop;

    public Client(Barbershop barbershop) {
        this.barbershop = barbershop;
    }

    @Override
    public void run() {
        try {
            do  {
                if (barbershop.isOpen()){
                    barbershop.newClient();
                } else {
                    System.out.println("The barbershop is closed");
                }
                Thread.sleep(3000);
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
