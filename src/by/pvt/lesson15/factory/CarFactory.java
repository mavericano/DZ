package by.pvt.lesson15.factory;

public class CarFactory {


    public Car buildCar(CarType model) {
        switch (model) {
            case LUXURY: {
                return new LuxuryCar(model);
            }
            case SEDAN: {
                return new SedanCar(model);
            }
            case SMALL: {
                return new SmallCar(model);
            }
            default:{
                System.out.println("Wrong type");
                return null;
            }
        }
    }
}
