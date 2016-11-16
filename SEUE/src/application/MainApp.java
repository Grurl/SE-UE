package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainApp extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;

	private ObservableList<Room> roomData = FXCollections.observableArrayList();

	public MainApp() {

		roomData.add(new Room("EG01", "Bad", 23, "Ja", "Ja"));
		roomData.add(new Room("EG02", "Wohnzimmer", 11, "Ja", "Ja"));
		roomData.add(new Room("EG03", "Küche", 21, "Nein", "Nein"));
		roomData.add(new Room("OG01", "Schlafzimmer", 39, "Nein", "Ja"));
		roomData.add(new Room("OG02", "Klo", 33, "Ja", "Nein"));

	}

	public ObservableList<Room> getRoomData() {
		return roomData;
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("SmartHome Application");
			
			initRootLayout();
			showLogin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void showLogin() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("UserLogin.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			UserLoginController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void showHomepage() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("MainApp.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			MainMenueController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void showAdministration() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("Administration.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			AdministrationController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showLight() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("Light.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			LightController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showUserAdministration() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("UserAdministration.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			UserAdministrationController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showAlarm() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("Alarm.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			AlarmController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showHeating() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("Heating.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			HeatingController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void showRoomOverview() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("RoomOverview.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			RoomOverviewController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showHeatingTime() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("HeatingTime.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			HeatingTimeController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showLightTime() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("LightTime.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			LightTimeController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showAlarmTime() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("AlarmTime.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			AlarmTimeController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showUserLogin() {
		try {
			// Load
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("UserLogin.fxml"));
			AnchorPane userOverview = (AnchorPane) loader.load();
			// Set into the center of root layout
			rootLayout.setCenter(userOverview);
			// Give the controller access to the main app
			UserLoginController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean showRoomEditDialog(Room room) {
	    try {
	        // Load the fxml file and create a new stage for the popup dialog.
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainApp.class.getResource("RoomEditDialog.fxml"));
	        AnchorPane page = (AnchorPane) loader.load();

	        // Create the dialog Stage.
	        Stage dialogStage = new Stage();
	        dialogStage.setTitle("Edit Room");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);

	        // Set the person into the controller.
	        RoomDialogController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	        controller.setRoom(room);

	        // Show the dialog and wait until the user closes it
	        dialogStage.showAndWait();

	        return controller.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
}
