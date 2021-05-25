package com.company;

import java.util.Date;

public class Clipshoot extends Reservering {
    private String editor;

    public Clipshoot(int id, int aantalPersonen, Date date, String editor) {
        super(id, aantalPersonen, date);
        if(editor == null){
            throw new IllegalArgumentException("Geef een editor aan");
        }
        this.setOmschrijving("Clipshoot");
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
