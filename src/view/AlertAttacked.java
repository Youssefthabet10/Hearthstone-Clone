package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertAttacked {
	public static void display () {
		Stage window = new Stage();
		
		window.setTitle("Cannot Attack");
		StackPane alart = new StackPane();
		
		Button b= new Button("Okay ლ(ಠ_ಠლ)");
		b.setAlignment(Pos.CENTER);
		
		alart.setPadding(new Insets(75, 0, 0, 0));
		
		alart.getChildren().add(b);
		
		
		Scene y = new Scene(alart, 500,281);

		BackgroundImage bg = new BackgroundImage(new Image("file:attacked.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.CENTER, new BackgroundSize(500, 281, false,
						false, false, true));
		alart.setBackground(new Background(bg));
		window.setScene(y);
		b.setOnMouseClicked(e-> window.close());
		window.initModality(Modality.APPLICATION_MODAL);
		window.showAndWait();
		
	
		
		
	}
}