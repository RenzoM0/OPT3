package com.company;

import java.util.Date;

public class Covershoot extends Reservering {

    private String locatie;

    public Covershoot(int id, int aantalPersonen, Date date, String locatie) {
        super(id, aantalPersonen, date);
        this.locatie = locatie;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
}
