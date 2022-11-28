package com.mycompany.oopproject;

import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    Fridge frg = new Fridge();
    Washing wsh = new Washing();
    Television tv = new Television();
    
    @Override
    public void start(Stage stage) {
      //creating label  
      Text text1 = new Text("WASHING MACHINE");
      Text text2 = new Text ("FRIDGE");
      Text text3 = new Text ("TELEVISON");
      //Creating Buttons 
      Button btnWash1 = new Button("On"); 
      Button btnWash2 = new Button("Off");
      
      Button btnLow= new Button("Low");
      Button btnMed= new Button("Medium");
      Button btnHig= new Button("High");

      Button btnFridge1 = new Button("On"); 
      Button btnFridge2 = new Button("Off");
      
      Button btn1Low= new Button("10'C");
      Button btn1Med= new Button("8'C");
      Button btn1Hig= new Button("6'C");
      
      Button btnTV1 = new Button("On"); 
      Button btnTV2 = new Button("Off");
      
      Button btn2Low= new Button("480p");
      Button btn2Med= new Button("720p");
      Button btn2Hig= new Button("1080p");
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();
      // action event
      EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                //label1.setText("   Remaining: 70 Kw equivalance to 1 hours left ");
                //text2.setText(" 100Kw == 3 hours of uses");
                try {
                    wsh.window();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
      
      
      EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                // set alert type
                //a.setAlertType(AlertType.WARNING);
                // set content text
                //a.setContentText("Approximately 1 hours of uses left");
                // show the dialog
                //a.show();
                try {
                    frg.window();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
      EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                // set alert type
                //a.setAlertType(AlertType.WARNING);
                // set content text
                //a.setContentText("Approximately 1 hours of uses left");
                // show the dialog
                //a.show();
                try {
                    tv.window();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
      
      //when button is pressed
      btnWash1.setOnAction(event1);
      btnFridge1.setOnAction(event2);
      btnTV1.setOnAction(event3);
      //Setting size for the pane 
      gridPane.setMinSize(500, 250); 
      
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(3); 
      gridPane.setHgap(100);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.TOP_LEFT); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0);
      gridPane.add(text2, 0, 6);
      gridPane.add(text3, 0, 13);
      gridPane.add(btnWash1, 0, 2); 
      gridPane.add(btnWash2, 1, 2); 
      gridPane.add(btnLow, 0, 5);
      gridPane.add(btnMed, 1, 5);
      gridPane.add(btnHig, 2, 5);
      gridPane.add(btnFridge1, 0, 8);
      gridPane.add(btnFridge2, 1, 8);
      gridPane.add(btn1Low, 0, 10);
      gridPane.add(btn1Med, 1, 10);
      gridPane.add(btn1Hig, 2, 10);
      gridPane.add(btnTV1, 0, 15);
      gridPane.add(btnTV2, 1, 15);
      gridPane.add(btn2Low, 0, 18);
      gridPane.add(btn2Med, 1, 18);
      gridPane.add(btn2Hig, 2, 18);
      
       
      //Styling nodes  
      btnWash1.setStyle("-fx-background-color: green; -fx-text-fill: white;"); 
      btnWash2.setStyle("-fx-background-color: red; -fx-text-fill: white;");
      btnFridge1.setStyle("-fx-background-color: green; -fx-text-fill: white;"); 
      btnFridge2.setStyle("-fx-background-color: red; -fx-text-fill: white;");
      btnTV1.setStyle("-fx-background-color: green; -fx-text-fill: white;"); 
      btnTV2.setStyle("-fx-background-color: red; -fx-text-fill: white;");
       
      text1.setStyle("-fx-font: normal  15px 'serif' "); 
      text2.setStyle("-fx-font: normal  15px 'serif' ");
      text3.setStyle("-fx-font: normal  15px 'serif' ");
      //text2.setStyle("-fx-font: normal  20px 'serif' "); 
      //label1.setStyle("-fx-font: normal bold 10px 'serif' ");
      gridPane.setStyle("-fx-background-color: BEIGE;"); 
       
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
       
      //Setting title to the Stage 
      stage.setTitle("Electrical Appliances"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show();
    }
    public static void main(String args[]){ 
      launch(args); 
   }
}