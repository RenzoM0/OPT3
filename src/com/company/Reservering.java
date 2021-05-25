package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Reservering {
    private int id;
    private int aantalPersonen;
    private String omschrijving;
    private Date date;
    private Date currentDate = new Date(System.currentTimeMillis());
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/uuuu");

    public Reservering(int id, int aantalPersonen, String date) {
        Date input = null;
        try {
             input = dateFormat.parse(date);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        if(aantalPersonen < 2 || aantalPersonen > 6){
            throw new IllegalArgumentException("Aantal personen moeten minmaal 2 en max 6 zijn");
        }
        /*if(input == null || input.before(currentDate)){
            throw new IllegalArgumentException("Voer een geldige datum in");
        }*/
        this.id = id;
        this.aantalPersonen = aantalPersonen;
        this.omschrijving = "Reservering";
        this.date = input;
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
