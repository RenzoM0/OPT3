package Models;

public abstract class Reservering {

    private static final int min = 2;
    private static final int max = 6;

    private int aantalPersonen;
    private String omschrijving;
    private String date;

    public Reservering(int aantalPersonen, String date) {
        if(aantalPersonen < min || aantalPersonen > max){
            throw new IllegalArgumentException("Aantal personen moeten minmaal 2 en max 6 zijn");
        }
        this.aantalPersonen = aantalPersonen;
        this.omschrijving = "Reservering";
        this.date = date;
    }

    final void GeefOmschrijving(){
        AddPersonen();
        if(IsOpname()){
            AddProducer();
        }
        if(IsClipShoot()){
            AddEditor();
        }
        if(IsCoverShoot()){
            AddLocatie();
        }
    }

    public void AddPersonen(){
        System.out.println("Er zijn " + this.getAantalPersonen() + " toegevoegd aan deze reservering");
    }
    abstract void AddEditor();
    abstract void AddProducer();
    abstract void AddLocatie();

    boolean IsOpname(){return true;}
    boolean IsClipShoot(){return true;}
    boolean IsCoverShoot(){return true;}

    public static int getMin() {
        return min;
    }
    public static int getMax() {
        return max;
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

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
