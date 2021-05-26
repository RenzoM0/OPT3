package com.company;

public class Covershoot extends Reservering {

    private String locatie;

    public Covershoot(int id, int aantalPersonen, String date, String locatie) {
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
