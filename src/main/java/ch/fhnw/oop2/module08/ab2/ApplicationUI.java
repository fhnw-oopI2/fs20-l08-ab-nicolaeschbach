package ch.fhnw.oop2.module08.ab2;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationUI extends StackPane{

	private Button button;
	
	public ApplicationUI(PresentationModel pm, Stage stage) {
		// TODO Auto-generated constructor stub
		initializeControls(pm, stage);
		layoutControls();
	}

	
	private void initializeControls(PresentationModel pm, Stage stage){
		button = new Button();
		button.textProperty().bind(pm.getLabelProperty());
		button.setOnAction(pressed -> pm.toggleButton());
		stage.titleProperty().bind(pm.getTitleProperty());
		

	} 
	
	private void layoutControls(){
		button.setMinSize(80, 30);
		getChildren().add(button);
		
	}
	
	
	
	
}
