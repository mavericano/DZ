package by.pvt.lesson15.factory;

public abstract class Car {

    private CarType model;


    public Car(CarType model){
        this.model = model;
    }

    protected void construct(){

    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
