package ch.fhnw.oop2.module08.ab2v2;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationUI extends StackPane{

	private Button button;
	private PresentationModel presentationModel;
	
	public ApplicationUI(PresentationModel pm, Stage stage) {
		// TODO Auto-generated constructor stub
		this.presentationModel = pm;
		initializeControls(stage);
		layoutControls();
	}

	
	private void initializeControls(Stage stage){
		button = new Button();
		button.textProperty().bind(presentationModel.getStateProperty().asString());
		button.setOnAction(pressed -> presentationModel.toggleButton());
		stage.titleProperty().bind(presentationModel.getTitleProperty());
		

	} 
	
	private void layoutControls(){
		button.setMinSize(80, 30);
		getChildren().add(button);
	}	
}
