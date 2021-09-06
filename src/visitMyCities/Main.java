package visitMyCities;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	public void start(Stage welcome) throws Exception 
	{
		Parent root = FXMLLoader.load(getClass().getResource("cities.fxml"));
		welcome.setScene(new Scene(root,1280,720));
		welcome.setTitle("Visit My Cities");
		welcome.show();
	}

}
