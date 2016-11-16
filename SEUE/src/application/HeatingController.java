package application;



import javafx.fxml.FXML;



public class HeatingController {
	private MainApp mainApp;
	
	public HeatingController() {
	}

	@FXML
	public void initialize() {

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

	}

	@FXML
	public void showHeatingTime() {
		mainApp.showHeatingTime();
	}
	
	@FXML
	public void showHomepage() {
		mainApp.showHomepage();

	}

}
