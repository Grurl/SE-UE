package application;

import javafx.fxml.FXML;

public class UserAdministrationController {

	private MainApp mainApp;

	public UserAdministrationController() {
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

	@FXML
	public void showAlarmTime () {
		mainApp.showAlarmTime();
	}
}
