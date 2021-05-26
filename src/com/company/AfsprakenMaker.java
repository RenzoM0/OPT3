package com.company;

import java.util.Locale;

public class AfsprakenMaker {

    public Reservering MaakReservering(int id, int aantalPersonen, String date, String typeReservering, String specialValue){
        if(typeReservering.toLowerCase(Locale.ROOT) == "clipshoot"){
            return new Clipshoot(id,aantalPersonen,date,specialValue);
        } else if (typeReservering.toLowerCase(Locale.ROOT) == "opname") {
            return new Opname(id, aantalPersonen, date, specialValue);
        } else if (typeReservering.toLowerCase(Locale.ROOT) == "covershoot") {
            return new Covershoot(id, aantalPersonen, date, specialValue);
        } else return null;
    }


}
