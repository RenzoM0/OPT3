package com.company;

import java.util.Date;

public abstract class Reservering {
    private int id;
    private int aantalPersonen;
    private String omschrijving;
    private Date date;
    private Date currentDate = new Date(System.currentTimeMillis());

    public Reservering(int id, int aantalPersonen, Date date) {
        if(aantalPersonen < 2 || aantalPersonen > 6){
            throw new IllegalArgumentException("Aantal personen moeten minmaal 2 en max 6 zijn");
        }
        if(date == null || date.before(currentDate)){
            throw new IllegalArgumentException("Voer een geldige datum in");
        }
        this.id = id;
        this.aantalPersonen = aantalPersonen;
        this.omschrijving = "Reservering";
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
