package Models;

public class Clipshoot extends Reservering {

    private String editor;

    public Clipshoot(int aantalPersonen, String date, String editor) {
        super(aantalPersonen, date);
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

    @Override
    boolean IsOpname() {
        return false;
    }
    @Override
    boolean IsCoverShoot() {return false;}

    @Override
    void AddProducer() {
    }
    @Override
    void AddLocatie() {

    }
    @Override
    void AddEditor() {
        System.out.println("De editor is " + this.getEditor());
    }
}