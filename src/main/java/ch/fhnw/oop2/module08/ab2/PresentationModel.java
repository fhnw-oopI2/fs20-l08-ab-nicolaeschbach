package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {
	
	private StringProperty buttonLabelProperty;
	private StringProperty AppTitleProperty;
	private boolean state;
	
	
	public PresentationModel() {
		// TODO Auto-generated constructor stub
			
		buttonLabelProperty = new SimpleStringProperty("OFF");
		AppTitleProperty = new SimpleStringProperty("Toggle Application");
		state = false;
	
	}
	
	public StringProperty getLabelProperty() {
		return buttonLabelProperty;
		
	}
	
	public StringProperty getTitleProperty() {
		return AppTitleProperty;
	}
	
	public void toggleButton() {
		state = !state;
		buttonLabelProperty.set(state ? "ON" :"OFF" );
	}
}
