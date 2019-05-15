package by.pvt.lesson8;

import by.pvt.lesson8.by.CdPlayer;
import by.pvt.lesson8.by.Playable;

import java.text.ParseException;

public class InCapsule {
    public static void main(String[] args) throws ParseException {
        //Car beha = new Car("BMW");

/*
        String date = "11.02.1999";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(beha.toString());
        beha.setManufDate(simpleDateFormat.parse(date));
        beha.setModel("x6");
        System.out.println(beha.toString());
*/
        CdPlayer marshall = new CdPlayer();
        marshall.playMusic();
        marshall.playMusic(50);
        Playable pl = new CdPlayer();
        pl.playMusic();
        pl.playMusic(50);
    }
}
