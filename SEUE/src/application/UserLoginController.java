package application;

//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import javafx.fxml.FXML;
//import javafx.scene.control.ComboBox;


public class UserLoginController {


	private MainApp mainApp;
	
	//@FXML
//	private ComboBox<User> myComboBox;
//	private ObservableList<User> myComboBoxData = FXCollections.observableArrayList();

	
	
	
	public UserLoginController() {
	//	myComboBoxData.add(new User("Max"));
		//myComboBoxData.add(new User("Lisa"));

	
	}

	@FXML
	public void initialize() {	
		//myComboBox.setItems(myComboBoxData);
	

	}

	public void setMainApp(MainApp mainApp) {
	
		this.mainApp = mainApp;
	}

	@FXML
	public void showHomepage() {
		mainApp.showHomepage();
		

	}
	
	@FXML
	public void showUserAdministration() {
		mainApp.showUserAdministration();
	}

	

	
}