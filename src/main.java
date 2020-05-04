//Alan Trieu, Duc Truong, Jeane Taruc, Aldrin Cericos, Nowndale Sale
//CS2450
//Assignment 4
//May 4, 2020

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
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
    
    Stage window;
    Scene scene1, scene2, scene3;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //window = primaryStage;
        primaryStage.setTitle("Prototype");

        Text chatText = new Text("Chats");
        chatText.setFont(new Font("Segoe UI", 26));
        chatText.setStroke(Color.BLACK);
        
        Image image = new Image(new FileInputStream("test.png"));
        ImageView imageView = new ImageView(image); 
        imageView.setFitHeight(40); 
        imageView.setFitWidth(60); 
        Image image2 = new Image(new FileInputStream("test.png"));
        ImageView imageView2 = new ImageView(image2); 
        imageView2.setFitHeight(40); 
        imageView2.setFitWidth(60);
        Image image3 = new Image(new FileInputStream("friendicon.png"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitHeight(30); 
        imageView3.setFitWidth(50);
        Image image4 = new Image(new FileInputStream("chaticon.png"));
        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitHeight(30); 
        imageView4.setFitWidth(50);
        Image image5 = new Image(new FileInputStream("lockicon.png"));
        ImageView imageView5 = new ImageView(image5);
        imageView5.setFitHeight(30); 
        imageView5.setFitWidth(50);
        Image image6 = new Image(new FileInputStream("storeicon.png"));
        ImageView imageView6 = new ImageView(image6);
        imageView6.setFitHeight(30); 
        imageView6.setFitWidth(50);
        Image image7 = new Image(new FileInputStream("profileicon.png"));
        ImageView imageView7 = new ImageView(image7);
        imageView7.setFitHeight(30); 
        imageView7.setFitWidth(50);
        Image image8 = new Image(new FileInputStream("notificationicon.png"));
        ImageView imageView8 = new ImageView(image8); 
        imageView8.setFitHeight(20); 
        imageView8.setFitWidth(30);
        
        Text myText2 = new Text(" ");
        Text myText3 = new Text("\n");
        Text myText4 = new Text(" ");
        Text myText5 = new Text(" ");
        Text myText6 = new Text(" ");
        Text myText7 = new Text(" Alan");
        Text chat2 = new Text(" Duc");
        Text chat3 = new Text("\n  Mar 6");
        Text myText8 = new Text("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        Text myText9 = new Text("scene2");
        Text myText10 = new Text("\n  5:39 pm");
        Text message = new Text(" testtestest");
        Text message2 = new Text(" testtestest");
        
        final double x1 = 63.5, y1 = 0;
        final double x2 = 0, y2 = 0;
        
        Polyline polyline = new Polyline(x1, y1, x2, y2);
        Polyline polyline2 = new Polyline(x1, y1, x2, y2);
        Polyline polyline3 = new Polyline(x1, y1, x2, y2);
        Polyline polyline4 = new Polyline(x1, y1, x2, y2);
        Polyline polyline5 = new Polyline(x1, y1, x2, y2);
        Polyline polyline6 = new Polyline(x1, y1, x2, y2);
        Polyline polyline7 = new Polyline(x1, y1, x2, y2);
        Polyline polyline8 = new Polyline(x1, y1, x2, y2);
        Polyline polyline9 = new Polyline(x1, y1, x2, y2);
        Polyline polyline10 = new Polyline(x1, y1, x2, y2);
        Polyline polyline11 = new Polyline(x1, y1, x2, y2);
        Polyline polyline12 = new Polyline(x1, y1, x2, y2);
        Polyline polyline19 = new Polyline(x1, y1, x2, y2);
        Polyline polyline20 = new Polyline(x1, y1, x2, y2);
        Polyline polyline21 = new Polyline(x1, y1, x2, y2);
        Polyline polyline22 = new Polyline(x1, y1, x2, y2);
        Polyline polyline23 = new Polyline(x1, y1, x2, y2); 
        Polyline polyline24 = new Polyline(x1, y1, x2, y2); 
        
        Button button1 = new Button("");
        button1.setGraphic(imageView3);
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        Button button2 = new Button("");
        button2.setGraphic(imageView4);
        Button button3 = new Button("");
        button3.setGraphic(imageView5);
        Button button4 = new Button("");
        button4.setGraphic(imageView6);
        Button button5 = new Button("");
        button5.setGraphic(imageView7);
        button5.setOnAction(e -> primaryStage.setScene(scene3));
        Button button6 = new Button("");
        button6.setGraphic(imageView8);
        
        Image image18 = new Image(new FileInputStream("test.png"));
        ImageView imageView18 = new ImageView(image18); 
        imageView18.setFitHeight(70); 
        imageView18.setFitWidth(64); 
        Image image19 = new Image(new FileInputStream("friendicon.png"));
        ImageView imageView19 = new ImageView(image19);
        imageView19.setFitHeight(30); 
        imageView19.setFitWidth(50);
        Image image20 = new Image(new FileInputStream("chaticon.png"));
        ImageView imageView20 = new ImageView(image20);
        imageView20.setFitHeight(30); 
        imageView20.setFitWidth(50);
        Image image21 = new Image(new FileInputStream("lockicon.png"));
        ImageView imageView21 = new ImageView(image21);
        imageView21.setFitHeight(30); 
        imageView21.setFitWidth(50);
        Image image22 = new Image(new FileInputStream("storeicon.png"));
        ImageView imageView22 = new ImageView(image22);
        imageView22.setFitHeight(30); 
        imageView22.setFitWidth(50);
        Image image23 = new Image(new FileInputStream("profileicon.png"));
        ImageView imageView23 = new ImageView(image23);
        imageView23.setFitHeight(30); 
        imageView23.setFitWidth(50);
        Image image24 = new Image(new FileInputStream("notificationicon.png"));
        ImageView imageView24 = new ImageView(image24); 
        imageView24.setFitHeight(20); 
        imageView24.setFitWidth(30);
        Image image25 = new Image(new FileInputStream("dota2.png"));
        ImageView imageView25 = new ImageView(image25); 
        imageView25.setFitHeight(60); 
        imageView25.setFitWidth(60); 
        Image image26 = new Image(new FileInputStream("maple.png"));
        ImageView imageView26 = new ImageView(image26); 
        imageView26.setFitHeight(60); 
        imageView26.setFitWidth(60); 
        Image image27 = new Image(new FileInputStream("csgo.png"));
        ImageView imageView27 = new ImageView(image27); 
        imageView27.setFitHeight(60); 
        imageView27.setFitWidth(60);
        Image image28 = new Image(new FileInputStream("test.png"));
        ImageView imageView28 = new ImageView(image28); 
        imageView28.setFitHeight(60); 
        imageView28.setFitWidth(60);
        Image image29 = new Image(new FileInputStream("setting.png"));
        ImageView imageView29 = new ImageView(image29); 
        imageView29.setFitHeight(24); 
        imageView29.setFitWidth(30);
        Image image30 = new Image(new FileInputStream("test.png"));
        ImageView imageView30 = new ImageView(image30);
        imageView30.setFitHeight(60); 
        imageView30.setFitWidth(60);
        Image image31 = new Image(new FileInputStream("test.png"));
        ImageView imageView31 = new ImageView(image31); 
        imageView31.setFitHeight(60); 
        imageView31.setFitWidth(60);
        
        
        Button button13 = new Button("");
        button13.setGraphic(imageView19);
        button13.setOnAction(e -> primaryStage.setScene(scene2));
        Button button14 = new Button("");
        button14.setGraphic(imageView20);
        button14.setOnAction(e -> primaryStage.setScene(scene1));
        Button button15 = new Button("");
        button15.setGraphic(imageView21);
        Button button16 = new Button("");
        button16.setGraphic(imageView22);
        Button button17 = new Button("");
        button17.setGraphic(imageView23);
        button17.setOnAction(e -> primaryStage.setScene(scene3));
        Button button18 = new Button("");
        button18.setGraphic(imageView24);
        Button button19 = new Button("");
        button19.setGraphic(imageView29);
        
        Text profileText = new Text("Profil");
        profileText.setFont(new Font("Segoe UI", 26));
        profileText.setStroke(Color.BLACK);
        Text profileName = new Text(" Alan");
        profileName.setFont(new Font("Segoe UI", 26));
        profileName.setStroke(Color.BLACK);
        Text profileBio = new Text("      bio\n");
        Text profileGames = new Text("Gams");
        profileGames.setFont(new Font("Segoe UI", 22));
        profileGames.setStroke(Color.BLACK);
        Text profileFriends = new Text("Frend");
        profileFriends.setFont(new Font("Segoe UI", 22));
        profileFriends.setStroke(Color.BLACK);
        Text profileBadges = new Text("Badgs");
        profileBadges.setFont(new Font("Segoe UI", 22));
        profileBadges.setStroke(Color.BLACK);
        
        Text myText14 = new Text("\n");
        Text myText15 = new Text(" ");
        Text myText16 = new Text(" ");
        
        //scene 3
        GridPane gridpane3 = new GridPane();
        //gridpane3.setGridLinesVisible(true);
        scene3 = new Scene(gridpane3, 330, 520);
        
        //gridpane3.add(myText14, 0, 0);
        gridpane3.add(profileText, 0, 3);
        gridpane3.add(imageView18, 2, 4);
        gridpane3.add(profileName, 2, 5);
        gridpane3.add(profileBio, 2, 6);
        gridpane3.add(profileGames, 0, 7);
        gridpane3.add(imageView25, 0, 8);
        gridpane3.add(imageView26, 1, 8);
        gridpane3.add(imageView27, 2, 8);
        gridpane3.add(profileFriends, 0, 9);
        gridpane3.add(imageView28, 0, 10);
        gridpane3.add(imageView30, 1, 10);
        gridpane3.add(profileBadges, 0, 11);
        //gridpane3.add(myText16, 0, 13);
        gridpane3.add(button13, 0, 14);
        gridpane3.add(button14, 1, 14);
        gridpane3.add(button15, 2, 14);
        gridpane3.add(button16, 3, 14);
        gridpane3.add(button17, 4, 14);
        gridpane3.add(button18, 4, 0);
        gridpane3.add(button19, 0, 0);
        gridpane3.add(imageView31, 0, 12);
        
        //gridpane3.add
        
        Text friendsText = new Text("Frend");
        friendsText.setFont(new Font("Segoe UI", 26));
        friendsText.setStroke(Color.BLACK);
        Text onlineText = new Text(" Online");
        onlineText.setFont(new Font("Segoe UI", 10));
        onlineText.setStroke(Color.GREEN);
        Text offlineText = new Text("\n Offline");
        offlineText.setFont(new Font("Segoe UI", 10));
        offlineText.setStroke(Color.GRAY);
        Text myText11 = new Text("\n");
        Text myText12 = new Text(" Alan");
        Text onlineFriend = new Text(" Duc");
        Text offlineFriend = new Text(" Jeane");
        Text offlineDate = new Text("       Offline");
        Text offlineDate2 = new Text("for 1 year");
        Text friendGame = new Text("       Playing");
        Text friendGame2 = new Text("Maplestory");
        Text myText13 = new Text("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        //scene 2
        GridPane gridpane2 = new GridPane();
        //gridpane2.setGridLinesVisible(true);
        scene2 = new Scene(gridpane2, 330, 520);
        
        Image image9 = new Image(new FileInputStream("test.png"));
        ImageView imageView9 = new ImageView(image9); 
        imageView9.setFitHeight(40); 
        imageView9.setFitWidth(60);
        Image image10 = new Image(new FileInputStream("test.png"));
        ImageView imageView10 = new ImageView(image10); 
        imageView10.setFitHeight(40); 
        imageView10.setFitWidth(60);
        Image image17 = new Image(new FileInputStream("test.png"));
        ImageView imageView17 = new ImageView(image17); 
        imageView17.setFitHeight(40); 
        imageView17.setFitWidth(60);
        Image image11 = new Image(new FileInputStream("friendicon.png"));
        ImageView imageView11 = new ImageView(image11);
        imageView11.setFitHeight(30); 
        imageView11.setFitWidth(50);
        Image image12 = new Image(new FileInputStream("chaticon.png"));
        ImageView imageView12 = new ImageView(image12);
        imageView12.setFitHeight(30); 
        imageView12.setFitWidth(50);
        Image image13 = new Image(new FileInputStream("lockicon.png"));
        ImageView imageView13 = new ImageView(image13);
        imageView13.setFitHeight(30); 
        imageView13.setFitWidth(50);
        Image image14 = new Image(new FileInputStream("storeicon.png"));
        ImageView imageView14 = new ImageView(image14);
        imageView14.setFitHeight(30); 
        imageView14.setFitWidth(50);
        Image image15 = new Image(new FileInputStream("profileicon.png"));
        ImageView imageView15 = new ImageView(image15);
        imageView15.setFitHeight(30); 
        imageView15.setFitWidth(50);
        Image image16 = new Image(new FileInputStream("notificationicon.png"));
        ImageView imageView16  = new ImageView(image16); 
        imageView16.setFitHeight(20); 
        imageView16.setFitWidth(30);
        
        Polyline polyline13 = new Polyline(x1, y1, x2, y2);
        Polyline polyline14 = new Polyline(x1, y1, x2, y2);
        Polyline polyline15 = new Polyline(x1, y1, x2, y2);
        Polyline polyline16 = new Polyline(x1, y1, x2, y2);
        Polyline polyline17 = new Polyline(x1, y1, x2, y2);
        Polyline polyline18 = new Polyline(x1, y1, x2, y2);
        Polyline polyline25 = new Polyline(x1, y1, x2, y2);    
        Polyline polyline26 = new Polyline(x1, y1, x2, y2);    
        Polyline polyline27 = new Polyline(x1, y1, x2, y2);    
        Polyline polyline28 = new Polyline(x1, y1, x2, y2);
        Polyline polyline29 = new Polyline(x1, y1, x2, y2);
        Polyline polyline30 = new Polyline(x1, y1, x2, y2);
        
        Button button7 = new Button("");
        button7.setGraphic(imageView11);
        button7.setOnAction(e -> primaryStage.setScene(scene2));
        Button button8 = new Button("");
        button8.setGraphic(imageView12);
        button8.setOnAction(e -> primaryStage.setScene(scene1));
        Button button9 = new Button("");
        button9.setGraphic(imageView13);
        Button button10 = new Button("");
        button10.setGraphic(imageView14);
        Button button11 = new Button("");
        button11.setGraphic(imageView15);
        button11.setOnAction(e -> primaryStage.setScene(scene3));
        Button button12 = new Button("");
        button12.setGraphic(imageView16);
        
        gridpane2.add(myText11, 0, 0);
        gridpane2.add(friendsText, 0, 3);
        //gridpane2.add(myText12, 0, 4);
        gridpane2.add(onlineText, 0, 5);
        gridpane2.add(polyline7, 1, 8);
        gridpane2.add(polyline8, 4, 6);
        gridpane2.add(polyline12, 3, 6);
        gridpane2.add(polyline13, 0, 6);
        gridpane2.add(polyline15, 1, 6);
        gridpane2.add(polyline16, 2, 6);
        gridpane2.add(imageView9, 0, 7);
        gridpane2.add(myText12, 1, 7);
        gridpane2.add(friendGame, 2, 7);
        gridpane2.add(friendGame2, 3, 7);
        gridpane2.add(polyline14, 0, 8);
        gridpane2.add(polyline28, 4, 8);
        gridpane2.add(polyline29, 2, 8);
        gridpane2.add(polyline30, 3, 8);
        gridpane2.add(imageView10, 0, 9);
        gridpane2.add(onlineFriend, 1, 9);
        gridpane2.add(polyline17, 0, 10);
        gridpane2.add(polyline18, 1, 10);
        gridpane2.add(polyline25, 2, 10);
        gridpane2.add(polyline26, 3, 10);
        gridpane2.add(polyline27, 4, 10);
        gridpane2.add(offlineText, 0, 11);
        gridpane2.add(imageView17, 0, 12);
        gridpane2.add(offlineFriend, 1, 12);
        gridpane2.add(offlineDate, 2, 12);
        gridpane2.add(offlineDate2, 3, 12);
        gridpane2.add(myText13, 0, 13);
        gridpane2.add(button7, 0, 15);
        gridpane2.add(button8, 1, 15);
        gridpane2.add(button9, 2, 15);
        gridpane2.add(button10, 3, 15);
        gridpane2.add(button11, 4, 15);
        gridpane2.add(button12, 4, 0);
                
        //scene 1
        GridPane gridpane = new GridPane();
        //gridpane.setGridLinesVisible(true);
        
        gridpane.add(chatText, 0, 3);
        //gridpane.add(myText2, 1, 3);
        gridpane.add(myText3, 0, 0);
        gridpane.add(button6, 4, 0);
        //gridpane.add(myText5, 0, 2);
        gridpane.add(myText6, 0, 4);
        gridpane.add(polyline, 0, 5);
        gridpane.add(polyline3, 1, 5);
        gridpane.add(polyline9, 2, 5);
        gridpane.add(polyline19, 3, 5);
        gridpane.add(polyline20, 4, 5);
        gridpane.add(myText7, 1, 7);
        gridpane.add(message, 2, 7);
        gridpane.add(myText10, 4, 7);
        gridpane.add(imageView, 0, 7);
        gridpane.add(polyline2, 0, 8);
        gridpane.add(polyline4, 1, 8);
        gridpane.add(polyline10, 2, 8);
        gridpane.add(polyline21, 3, 8);
        gridpane.add(polyline22, 4, 8);
        gridpane.add(imageView2, 0, 9);
        gridpane.add(chat2, 1, 9);
        gridpane.add(message2, 2, 9);
        gridpane.add(chat3, 4, 9);
        gridpane.add(polyline5, 0, 10);
        gridpane.add(polyline6, 1, 10);
        gridpane.add(polyline11, 2, 10);
        gridpane.add(polyline23, 3, 10);
        gridpane.add(polyline24, 4, 10);
        gridpane.add(myText8, 0, 11);
        gridpane.add(button1, 0, 13);
        gridpane.add(button2, 1, 13);
        gridpane.add(button3, 2, 13);
        gridpane.add(button4, 3, 13);
        gridpane.add(button5, 4, 13);
        //gridpane.add(button6, 2, 14);
        
        scene1 = new Scene(gridpane, 330, 520);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}