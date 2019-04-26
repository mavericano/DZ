package lesson8;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Car {

    /*private String brand;
    private String model;
    private Date manufDate;*/

    Map properties = new HashMap();

    public Car(String brand) {
        properties.put("brand", brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", manufDate=" + getManufDate() +
                '}';
    }

    public String getBrand() {
        //return brand;
        return (String) properties.get("brand");
    }

    public String getModel() {
        /*return model;*/
        return (String) properties.get("model");
    }

    public Date getManufDate() {
        /*return manufDate;*/
        return (Date) properties.get("manufDate");
    }

    public void setModel(String model) {
        properties.put("model", model);
    }

    public void setManufDate(Date manufDate) {
        /*this.manufDate = manufDate;*/
        properties.put("manufDate", manufDate);
    }
}
