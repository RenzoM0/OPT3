package Controller;

import Models.AfsprakenMaker;
import Models.Afsprakenlijst;
import Models.Reservering;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.awt.event.MouseEvent;
import java.time.format.DateTimeFormatter;

public class HomeScreenController {

    @FXML
    private TextField SpecialValueLabel;
    @FXML
    private ChoiceBox<String> TypeReserveringBttn;
    @FXML
    private ChoiceBox<Integer> AantalPersonenBttn;
    @FXML
    private DatePicker DatePicker;
    @FXML
    private Button MaakAfspraakBttn, GeefOmschrijvingBttn;
    @FXML
    private TableView<Reservering> AfsprakenLijstTable;
    @FXML
    private TableColumn<Reservering, String> DatumColmn;
    @FXML
    private TableColumn<Reservering, String> TypeResColumn;

    private Afsprakenlijst lijst = Afsprakenlijst.getInstance();
    private AfsprakenMaker maker = new AfsprakenMaker();
    private ObservableList<Reservering> oList = FXCollections.observableArrayList(Afsprakenlijst.getReserveringen());

    @FXML
    public void initialize(){
        fillAantalPersonenBttn();
        fillTypeReserveringBttn();
       AfsprakenLijstTable.setItems(oList);
    }
    @FXML
    void GeefOmschrijving(MouseEvent event) {

    }

    @FXML
    void MaakAfspraak(MouseEvent event) {
        lijst.AddReservering(maker.MaakReservering(AantalPersonenBttn.getValue(), DatePicker.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),TypeReserveringBttn.getValue(),SpecialValueLabel.getText()));
        AfsprakenLijstTable.getItems().clear();
        AfsprakenLijstTable.setItems(oList);
    }
    private void fillAantalPersonenBttn(){
        for(int i = Reservering.getMin(); i < Reservering.getMax() + 1; i++){
            AantalPersonenBttn.getItems().add(i);
        }
    }
    private void fillTypeReserveringBttn(){
        TypeReserveringBttn.getItems().add("Clipshoot");
        TypeReserveringBttn.getItems().add("Opname");
        TypeReserveringBttn.getItems().add("Covershoot");
    }

    /*public void MaakAfspraak(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void GeefOmschrijving(javafx.scene.input.MouseEvent mouseEvent) {
    }*/
}
