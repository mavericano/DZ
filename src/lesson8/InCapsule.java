package lesson8;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InCapsule {
    public static void main(String[] args) throws ParseException {
        Car beha = new Car("BMW");

        String date = "11.02.1999";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(beha.toString());
        beha.setManufDate(simpleDateFormat.parse(date));
        beha.setModel("x6");
        System.out.println(beha.toString());
    }
}
