package Models;

import java.util.Locale;

public class AfsprakenMaker extends AfsprakenMakerFactory {

    @Override
    public Reservering maakReservering(int aantalPersonen, String date, String typeReservering, String specialValue) {
        Reservering reservering = null;
        switch (typeReservering.toLowerCase(Locale.ROOT)) {
            case "clipshoot":
                reservering = new Clipshoot(aantalPersonen, date, specialValue);
                break;
            case "opname":
                reservering = new Opname(aantalPersonen, date, specialValue);
                break;
            case "covershoot":
                reservering = new Covershoot(aantalPersonen, date, specialValue);
                break;
        }
        return reservering;
    }
}
