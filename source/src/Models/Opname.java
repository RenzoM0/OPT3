package Models;

public class Opname extends Reservering {
    private String producer;

    public Opname(int aantalPersonen, String date, String producer) {
        super(aantalPersonen, date);
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

    @Override
    boolean IsOpname(){return true;}

    @Override
    String AddEditor() {
        return "";
    }
    @Override
    String AddLocatie() {
        return "";
    }
    @Override
    String AddProducer() {
        return "\nDe producer is " + this.getProducer();
    }
}
