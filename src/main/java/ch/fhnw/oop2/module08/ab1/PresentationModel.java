package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {
	
	private StringProperty buttonLabelProperty;
	private StringProperty buttonTitleProperty;
	
	
	
	public PresentationModel() {
		// TODO Auto-generated constructor stub
			
		buttonLabelProperty = new SimpleStringProperty("Hello World!");
		buttonTitleProperty = new SimpleStringProperty("JavaFX Application");
		
	
	}
	
	

	
	public StringProperty getLabelProperty() {
		return buttonLabelProperty;
		
	}
	
	public StringProperty getTitleProperty() {
		return buttonTitleProperty;
		
	}
}
