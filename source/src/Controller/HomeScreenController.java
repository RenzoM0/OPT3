package Controller;

import Models.AfsprakenMaker;
import Models.Afsprakenlijst;
import Models.DateHandler;
import Models.Reservering;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

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
    private TableColumn<Reservering, String> DatumColmn, TypeResColumn;

    private DateHandler dateHandler = new DateHandler();
    private Afsprakenlijst lijst = Afsprakenlijst.getInstance();
    private AfsprakenMaker maker = new AfsprakenMaker();

    @FXML
    public void initialize(){
        fillAantalPersonenBttn();
        fillTypeReserveringBttn();
        DatumColmn.setCellValueFactory(new PropertyValueFactory<Reservering, String>("date"));
        TypeResColumn.setCellValueFactory(new PropertyValueFactory<Reservering, String>("omschrijving"));
        AfsprakenLijstTable.setItems(lijst.getOlist());
    }
    @FXML
    void GeefOmschrijving(MouseEvent event) {
        showOmschrijving(Alert.AlertType.INFORMATION, "Reservering Omschrijving",AfsprakenLijstTable.getSelectionModel().getSelectedItem().GeefOmschrijving());
    }

    private static void showOmschrijving(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }

    @FXML
    void MaakAfspraak(MouseEvent event) {
        lijst.AddReservering(maker.maakReservering(AantalPersonenBttn.getSelectionModel().getSelectedItem(), dateHandler.getDateFormat(DatePicker.getValue()),TypeReserveringBttn.getSelectionModel().getSelectedItem(),SpecialValueLabel.getText()));
        AfsprakenLijstTable.getItems().clear();
        AfsprakenLijstTable.setItems(lijst.getOlist());
    }

    private void fillAantalPersonenBttn(){
        for(int i = Reservering.getMin(); i < Reservering.getMax() + 1; i++){
            AantalPersonenBttn.getItems().add(i);
        }
        AantalPersonenBttn.setValue(2);
    }
    private void fillTypeReserveringBttn(){
        TypeReserveringBttn.getItems().add("clipshoot");
        TypeReserveringBttn.getItems().add("opname");
        TypeReserveringBttn.getItems().add("covershoot");
        TypeReserveringBttn.setValue("clipshoot");
    }
}
