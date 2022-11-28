/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 *
 * @author Nabil.s
 */
public class Fridge {
    private final Integer startTime = 400;
    private Integer seconds = startTime;
    private Label label;
    
    public void window() throws Exception
    {
        Stage windows = new Stage();
        label = new Label();     
        label.setTextFill(Color.BLACK);
        label.setFont(Font.font(20));
        HBox layout = new HBox(5);
        layout.setLayoutX(20);
        layout.getChildren().add(label);

        doTime();
        windows.setScene(new Scene(layout, 300, 70, Color.BLACK));    
        windows.setTitle("Count down Timer");
        windows.show();
    }
    
    public void doTime(){
        //Duration duration = Duration.ofSeconds(10000);
        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);
        if(time!= null){//if the time is equal to zero it is finished but if it is not equal to something then it is //doing something
            time.stop();
        }
        KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>(){
                        //every one second of the timeline the keyframe will do something (i.e., perform a job and that job //is defined by the event handler)
                        @Override
                        public void handle(ActionEvent event){
                            seconds--;
                            label.setText("Fridge : "+seconds.toString());

                            //setup alert when reaching < 100
                            if(seconds <= 390){
                                time.stop();
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setHeaderText("Count down reset to 0!");
                                alert.show();
                            }
                        }
                    });
        time.getKeyFrames().add(frame);
        time.playFromStart();

    }
}
