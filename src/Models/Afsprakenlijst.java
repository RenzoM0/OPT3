package Models;

import java.util.ArrayList;

public class Afsprakenlijst {
    private static Afsprakenlijst afsprakenlijst;
    private static ArrayList<Reservering> reserveringen;

    private Afsprakenlijst(){
        reserveringen = new ArrayList<>();
    }

    public static Afsprakenlijst getInstance() {
        if(afsprakenlijst == null){
            afsprakenlijst = new Afsprakenlijst();
        }
        return afsprakenlijst;
    }

    public static ArrayList<Reservering> getReserveringen() {
        return reserveringen;
    }
    public static void setReserveringen(ArrayList<Reservering> reserveringen) {
        Afsprakenlijst.reserveringen = reserveringen;
    }

    public void AddReservering(Reservering reservering){
        if(reserveringen.isEmpty()) {
            reserveringen.add(reservering);
        } else {
            if (CheckDatum(reservering)) {
                reserveringen.add(reservering);
            } else throw new IllegalArgumentException("Datum is vol");
        }
    }
    public boolean CheckDatum(Reservering reservering){
        for (Reservering res : reserveringen){
            if ( res.getDate() == reservering.getDate()){
                return false;
            }
        }
        return true;
    }
}
