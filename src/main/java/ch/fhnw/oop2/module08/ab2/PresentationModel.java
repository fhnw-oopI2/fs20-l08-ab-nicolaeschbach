package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {
	
	private StringProperty buttonLabelProperty;
	private StringProperty AppTitleProperty;
	private BooleanProperty buttonStateProperty;
	
	
	public PresentationModel() {
		// TODO Auto-generated constructor stub
			
		buttonLabelProperty = new SimpleStringProperty("OFF");
		AppTitleProperty = new SimpleStringProperty("Toggle Application");
		buttonStateProperty = new SimpleBooleanProperty(false);
	
	}
	
	public StringProperty getLabelProperty() {
		return buttonLabelProperty;
		
	}
	
	public StringProperty getTitleProperty() {
		return AppTitleProperty;
	}
	
	public BooleanProperty getButtonStateProperty() {
		return buttonStateProperty;
		
	}
	
	public void toggleButton() {
		buttonStateProperty.set(!buttonStateProperty.getValue());
		buttonLabelProperty.set(buttonStateProperty.getValue() ? "ON" :"OFF" );
	}
}
