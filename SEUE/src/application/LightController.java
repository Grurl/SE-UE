package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;


public class LightController {
	private MainApp mainApp;
	@FXML
	private Slider dimmSli;

	@FXML
	private Label dimmLbl;

	int defaultValue = 10;

	IntegerProperty sliderValue = new SimpleIntegerProperty(defaultValue);  
	
	public LightController() {
	}

	@FXML
	public void initialize() {

	       dimmSli.setShowTickMarks(true);
	       dimmSli.setShowTickLabels(true);

	       dimmSli.setLayoutX(300);
	       dimmSli.setLayoutY(200);

	       dimmSli.setMin(0);
	       dimmSli.setMax(100);
	       dimmSli.setMajorTickUnit(25);
	       dimmSli.setMinorTickCount(5);
	       dimmSli.valueProperty().bindBidirectional(sliderValue);

	     
	       dimmLbl.textProperty().bind(sliderValue.asString());
	      
		
		
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

	}

	@FXML
	public void showHomepage() {
		mainApp.showHomepage();

	}

	@FXML
	public void showLightTime() {
		mainApp.showLightTime();
	}

}
