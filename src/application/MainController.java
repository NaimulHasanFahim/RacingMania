package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private Label  msg;
	
	@FXML
	private Label lb;
	
	@FXML
	private TextField txtus;
	
	@FXML
	private TextField txtpass;
//	
//	 private Image jj =new Image(MainController.class.getResource("tree4.png").toExternalForm());
//	 
//	 ImageView tree = new ImageView(jj);
	 
	
    public void Login(ActionEvent  event) throws Exception {
		
		if(txtus.getText().equals("user")&&txtpass.getText().equals("pass")){
			lb.setText("Logged in Successfully");
			
			
			Stage primaryStage = new Stage( );
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
	  		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("02");
		}
		else {
			lb.setText("Login Failed");
		}
	}
    
    
	
	
	public void GenRan(ActionEvent event) {
		
		Random rand = new Random();
		
		int myrand=rand.nextInt(50)+1;
		
		msg.setText(Integer.toString(myrand));
		
	}	

}
