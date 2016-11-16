package application;


import javafx.fxml.FXML;

public class RootLayoutController {

	private MainApp mainApp;

	@FXML
	private void handleGoToHomepage() {
		mainApp.showHomepage();
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
}
