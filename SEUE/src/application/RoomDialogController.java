package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RoomDialogController {
	@FXML
	private TextField roomNrFld;
	@FXML
	private TextField roomNameFld;
	@FXML
	private TextField roomLightFld;
	@FXML
	private TextField roomHeatFld;
	@FXML
	private TextField roomDegFld;

	private Stage dialogStage;
	private Room room;
	private boolean okClicked = false;

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
	}

	/**
	 * Sets the stage of this dialog.
	 * 
	 * @param dialogStage
	 */
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	/**
	 * Sets the person to be edited in the dialog.
	 * 
	 * @param person
	 */
	public void setRoom(Room room) {
		this.room = room;
		roomNrFld.setText(room.getRoomNr());
		roomNameFld.setText(room.getRoomName());
		;
		roomLightFld.setText(room.getRoomLight());
		;
		roomHeatFld.setText(room.getRoomHeat());
		;
		roomDegFld.setText(Integer.toString(room.getRoomDeg()));
	}

	/**
	 * Returns true if the user clicked OK, false otherwise.
	 * 
	 * @return
	 */
	public boolean isOkClicked() {
		return okClicked;
	}

	/**
	 * Called when the user clicks ok.
	 */
	@FXML
	private void handleOk() {
		if (isInputValid()) {
			room.setLastName(roomNameFld.getText());
			room.setRoomNr(roomNrFld.getText());
			room.setRoomDeg(Integer.parseInt(roomDegFld.getText()));
			room.setRoomHeat(roomHeatFld.getText());
			room.setRoomLight(roomLightFld.getText());

			okClicked = true;
			dialogStage.close();
		}
	}

	/**
	 * Called when the user clicks cancel.
	 */
	@FXML
	private void handleCancel() {
		dialogStage.close();
	}

	/**
	 * Validates the user input in the text fields.
	 * 
	 * @return true if the input is valid
	 */
	private boolean isInputValid() {
		String errorMessage = "";

		if (roomNrFld.getText() == null || roomNrFld.getText().length() == 0) {
			errorMessage += "No valid first name!\n";
		}
		if (roomNameFld.getText() == null || roomNameFld.getText().length() == 0) {
			errorMessage += "No valid last name!\n";
		}
		if (roomHeatFld.getText() == null || roomHeatFld.getText().length() == 0) {
			errorMessage += "No valid street!\n";
		}

		if (roomDegFld.getText() == null || roomDegFld.getText().length() == 0) {
			errorMessage += "No valid postal code!\n";
		} else {
			// try to parse the postal code into an int.
			try {
				Integer.parseInt(roomDegFld.getText());
			} catch (NumberFormatException e) {
				errorMessage += "No valid postal code (must be an integer)!\n";
			}
		}

		if (roomLightFld.getText() == null || roomLightFld.getText().length() == 0) {
			errorMessage += "No valid city!\n";
		}

		

		if (errorMessage.length() == 0) {
			return true;
		} else {
			// Show the error message.
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(dialogStage);
			alert.setTitle("Invalid Fields");
			alert.setHeaderText("Please correct invalid fields");
			alert.setContentText(errorMessage);

			alert.showAndWait();

			return false;
		}
	}
}
