//Alan Trieu, Duc Truong, Jeane Taruc, Aldrin Cericos, Nowndale Sale
//CS2450
//Assignment 4
//May 4, 2020

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class main extends Application  {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Prototype");

        Text chatText = new Text(" Chats");
        chatText.setFont(new Font("Segoe UI", 32));
        chatText.setStroke(Color.BLACK);
        Text myText2 = new Text("       ");
        Text myText3 = new Text("       ");
        Text myText4 = new Text("       ");
        Text myText5 = new Text("       ");
        Text myText6 = new Text("       ");
        
        final double x1 = 350, y1 = 0;
        final double x2 = 0, y2 = 0;
        
        Polyline polyline = new Polyline(x1, y1, x2, y2);

        
        GridPane gridpane = new GridPane();
        //gridpane.setGridLinesVisible(true);
        
        gridpane.add(chatText, 0, 3);
        gridpane.add(myText2, 1, 3);
        gridpane.add(myText3, 0, 0);
        gridpane.add(myText4, 0, 1);
        gridpane.add(myText5, 0, 2);
        gridpane.add(myText6, 0, 4);
        gridpane.add(polyline, 0, 5);
        
        //gridpane.add(myText, 2, 4);
        
        
        Scene scene = new Scene(gridpane, 270, 520);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}