package Models;

public class Covershoot extends Reservering {

    private String locatie;

    public Covershoot(int aantalPersonen, String date, String locatie) {
        super(aantalPersonen, date);
        this.locatie = locatie;
    }

    public String getLocatie() {
        return locatie;
    }
    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    @Override
    boolean IsOpname() {
        return false;
    }
    @Override
    boolean IsClipShoot() {return false;}

    @Override
    void AddEditor() {

    }
    @Override
    void AddProducer() {

    }
    @Override
    void AddLocatie() {
        System.out.println("Clipshoot wordt gehouden op " + this.getLocatie());
    }
}
