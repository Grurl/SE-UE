package application;

import javafx.fxml.FXML;

public class HeatingTimeController {
	private MainApp mainApp;

	public HeatingTimeController() {
	}

	@FXML
	public void initialize() {

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

	}

	@FXML
	public void showHomepage() {
		mainApp.showHomepage();

	}

	

	

}
