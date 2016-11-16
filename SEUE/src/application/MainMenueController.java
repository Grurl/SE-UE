package application;

import javafx.fxml.FXML;

public class MainMenueController {
	private MainApp mainApp;

	public MainMenueController() {
	}

	@FXML
	private void initialize() {
	}

	public MainApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	private void showLightController() {
		mainApp.showLight();
	}

	@FXML
	private void showHeatingController() {
		mainApp.showHeating();
	}
	@FXML
	private void showUserAdministrationController() {
		mainApp.showUserAdministration();
	}
	@FXML
	private void showAlarmController() {
		mainApp.showAlarm();
	}
	@FXML
	private void showRoomOverviewController() {
		mainApp.showRoomOverview();
	}
	@FXML
	private void showAdministrationController() {
		mainApp.showAdministration();
	}
	@FXML
	private void showUserLoginController() {
		mainApp.showUserLogin();
	}

}
