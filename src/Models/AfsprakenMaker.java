package Models;

import java.util.Locale;

public class AfsprakenMaker {

    public Reservering MaakReservering(int aantalPersonen, String date, String typeReservering, String specialValue){
        if(typeReservering.toLowerCase(Locale.ROOT) == "clipshoot"){
            return new Clipshoot(aantalPersonen,date,specialValue);
        } else if (typeReservering.toLowerCase(Locale.ROOT) == "opname") {
            return new Opname(aantalPersonen, date, specialValue);
        } else if (typeReservering.toLowerCase(Locale.ROOT) == "covershoot") {
            return new Covershoot(aantalPersonen, date, specialValue);
        } else return null;
    }
}
