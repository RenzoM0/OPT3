package com.company;

import java.util.ArrayList;

public class Afsprakenlijst {
    private static Afsprakenlijst afsprakenlijst;
    private static ArrayList<Reservering> reserveringen;

    private Afsprakenlijst(){}

    public static Afsprakenlijst getInstance() {
        return afsprakenlijst;
    }

    public static ArrayList<Reservering> getReserveringen() {
        return reserveringen;
    }
    public static void setReserveringen(ArrayList<Reservering> reserveringen) {
        Afsprakenlijst.reserveringen = reserveringen;
    }

    public void AddReservering(Reservering reservering){
        reserveringen.add(reservering);
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
