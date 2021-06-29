package Models;

public class Covershoot extends Reservering {

    private String locatie;

    public Covershoot(int aantalPersonen, String date, String locatie) {
        super(aantalPersonen, date);
        this.locatie = locatie;
        this.setOmschrijving("Covershoot");
    }

    public String getLocatie() {
        return locatie;
    }
    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    @Override
    boolean IsCoverShoot(){return true;}

    @Override
    String AddEditor() {
        return "";
    }
    @Override
    String AddProducer() {
        return "";
    }
    @Override
    String AddLocatie() {
        return "\nCovershoot wordt gehouden op locatie " + this.getLocatie();
    }
}
