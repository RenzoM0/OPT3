package Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Afsprakenlijst {
    private static Afsprakenlijst afsprakenlijst;
    private static ArrayList<Reservering> reserveringen;

    private Afsprakenlijst(){
        reserveringen = new ArrayList<>();
    }

    public static Afsprakenlijst getInstance() {
        if(afsprakenlijst == null){
            afsprakenlijst = new Afsprakenlijst();
            afsprakenlijst.AddReservering(new Covershoot(4,"16/07/2023","NDSM werf"));
            afsprakenlijst.AddReservering(new Clipshoot(3,"17/07/2023","Jan Peters"));
        }
        return afsprakenlijst;
    }

    public ArrayList<Reservering> getReserveringen() {
        return reserveringen;
    }
    public void setReserveringen(ArrayList<Reservering> reserveringen) {
        Afsprakenlijst.reserveringen = reserveringen;
    }
    public ObservableList<Reservering> getOlist(){
        ObservableList<Reservering> oList = FXCollections.observableArrayList();
        oList.addAll(reserveringen);
        return oList;
    }

    public void AddReservering(Reservering reservering){
        if(reserveringen.isEmpty()) {
            reserveringen.add(reservering);
        } else {
            if (CheckDatum(reservering)) {
                reserveringen.add(reservering);
            } else throw new IllegalArgumentException("Datum is vol");
        }
    }
    private boolean CheckDatum(Reservering reservering){
        for (Reservering res : reserveringen){
            if (res.getDate().equals(reservering.getDate())){
                return false;
            }
        }
        return true;
    }
}
