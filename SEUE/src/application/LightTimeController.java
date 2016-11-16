package application;

import javafx.fxml.FXML;

public class LightTimeController {
	private MainApp mainApp;

	public LightTimeController() {
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
