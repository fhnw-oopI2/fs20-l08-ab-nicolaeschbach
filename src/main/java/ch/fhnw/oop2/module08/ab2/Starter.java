package ch.fhnw.oop2.module08.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application{

	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		PresentationModel pm = new PresentationModel();
		Parent root = new ApplicationUI(pm, stage);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setHeight(300);
		stage.setWidth(300);
		stage.show();
		
	}

	
	public static void main(String[] args) {
		Starter.launch(args);
	}
}
