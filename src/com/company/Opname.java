package com.company;

import java.util.Date;

public class Opname extends Reservering {
    private String producer;

    public Opname(int id, int aantalPersonen, String date, String producer) {
        super(id, aantalPersonen, date);
        if(producer == null){
            throw new IllegalArgumentException("Geef een producer aan");
        }
        this.producer = producer;
        this.setOmschrijving("Opname");
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
