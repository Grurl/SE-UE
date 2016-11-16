package application;

import javafx.fxml.FXML;

public class AlarmTimeController {
	private MainApp mainApp;

	public AlarmTimeController() {
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
