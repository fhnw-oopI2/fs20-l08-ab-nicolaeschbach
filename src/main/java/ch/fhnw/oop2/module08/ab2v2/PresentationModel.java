package ch.fhnw.oop2.module08.ab2v2;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class PresentationModel {
	
	public enum State {
		OFF,
		ON;
	}
	
	private ObjectProperty<State> buttonStateProperty;
	private StringProperty appTitleProperty;
	
	public PresentationModel() {
		buttonStateProperty = new SimpleObjectProperty<State>(State.OFF);
		appTitleProperty = new SimpleStringProperty();
		setTitle("Toggle Application");
	
	}
	
	public ObjectProperty<State> getStateProperty() {
		return buttonStateProperty;
		
	}
	
	public StringProperty getTitleProperty() {
		return appTitleProperty;
	}
	
	public void toggleButton() {
		buttonStateProperty.setValue(buttonStateProperty.get() == State.OFF ? State.ON : State.OFF);
	}

	public void setTitle(String title) {
		this.appTitleProperty.set(title);
	}
}
