package com.mycompany.test1;

import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
      Button btnFridge1 = new Button("On"); 
      Button btnFridge2 = new Button("Off");
      Button btnTV1 = new Button("On"); 
      Button btnTV2 = new Button("Off");
      
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
      gridPane.setHgap(0);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.TOP_LEFT); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0);
      gridPane.add(text2, 0, 6);
      gridPane.add(text3, 0, 13);
      gridPane.add(btnWash1, 0, 2); 
      gridPane.add(btnWash2, 1, 2); 
      gridPane.add(btnFridge1, 0, 8);
      gridPane.add(btnFridge2, 1, 8);
      gridPane.add(btnTV1, 0, 15);
      gridPane.add(btnTV2, 1, 15);
       
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