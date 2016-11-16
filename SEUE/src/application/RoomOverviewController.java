package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RoomOverviewController {

	@FXML
	private TableView<Room> roomTbl;
	@FXML
	private TableColumn<Room, String> roomNrClm;
	@FXML
	private TableColumn<Room, String> roomNameClm;
	@FXML
	private TableColumn<Room, String> roomHeatClm;
	@FXML
	private TableColumn<Room, Number> roomDegClm;
	@FXML
	private TableColumn<Room, String> roomLightClm;

	@FXML
	private Label roomNrLbl;
	@FXML
	private Label roomNameLbl;
	@FXML
	private Label roomHeatLbl;
	@FXML
	private Label roomLightLbl;
	@FXML
	private Label roomDegLbl;

	private MainApp mainApp;

	public RoomOverviewController() {
	}

	private void showRoomDetails(Room room) {
		if (room != null) {
			roomNrLbl.setText(room.getRoomNr());
			roomNameLbl.setText(room.getRoomName());
			roomHeatLbl.setText(room.getRoomHeat());
			roomLightLbl.setText(room.getRoomLight());
			roomDegLbl.setText(Integer.toString(room.getRoomDeg()));
		} else {
			roomNrLbl.setText("");
			roomNameLbl.setText("");
			roomHeatLbl.setText("");
			roomLightLbl.setText("");
			roomDegLbl.setText("");
		}
	}

	@FXML
	public void initialize() {
		roomNrClm.setCellValueFactory(cellData -> cellData.getValue().roomNrProperty());
		roomNameClm.setCellValueFactory(cellData -> cellData.getValue().roomNameProperty());
		roomHeatClm.setCellValueFactory(cellData -> cellData.getValue().roomHeatProperty());
		roomDegClm.setCellValueFactory(cellData -> cellData.getValue().roomDegProperty());
		roomLightClm.setCellValueFactory(cellData -> cellData.getValue().roomLightProperty());

		showRoomDetails(null);

		roomTbl.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> showRoomDetails(newValue));

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		// Add observable list data to the table
		roomTbl.setItems(mainApp.getRoomData());

	}
	
	@FXML
	private void handleDeleteRoom() {
	    int selectedIndex = roomTbl.getSelectionModel().getSelectedIndex();
	    if (selectedIndex >= 0){
	    roomTbl.getItems().remove(selectedIndex);
	    } else {
	        // Nothing selected.
	        Alert alert = new Alert(AlertType.WARNING);
	       
	        alert.setTitle("Keine Auswahl");
	        alert.setHeaderText("Sie haben keinen Raum ausgewählt!");
	        alert.setContentText("Bitte einen Raum aus der Tabelle auswählen.");

	        alert.showAndWait();
	    }
	}

	@FXML
	public void showHomepage() {
		mainApp.showHomepage();

	}
	
	@FXML
	private void handleNewRoom() {
	    Room tempRoom = new Room();
	    boolean okClicked = mainApp.showRoomEditDialog(tempRoom);
	    if (okClicked) {
	        mainApp.getRoomData().add(tempRoom);
	    }
	}
	
	@FXML
	private void handleEditPerson() {
	    Room selectedRoom = roomTbl.getSelectionModel().getSelectedItem();
	    if (selectedRoom != null) {
	        boolean okClicked = mainApp.showRoomEditDialog(selectedRoom);
	        if (okClicked) {
	            showRoomDetails(selectedRoom);
	        }

	    } else {
	        // Nothing selected.
	        Alert alert = new Alert(AlertType.WARNING);
	       // alert.initOwner(mainApp.getPrimaryStage());
	        alert.setTitle("Keine Auswahl");
	        alert.setHeaderText("Sie haben keinen Raum ausgewählt!");
	        alert.setContentText("Bitte einen Raum aus der Tabelle auswählen.");

	        alert.showAndWait();
	    }
	}

}
