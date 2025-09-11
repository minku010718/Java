package com.example.fxappbuttontest1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainApp extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox root = new HBox();
        root.setPrefSize(200, 50);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        //버튼을 달아보자!!!
        Button btn1 = new Button("OK");
        Button btn2 = new Button("Cancel");

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //버튼1을 눌렀을 때 할 내용을 여기에 코딩하세요!!!!
                System.out.println("OK OK OK ~~~!!!");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Cancel Cancel Cancel ~~~!!!");
            }
        });

//        root.getChildren().add(btn1);
//        root.getChildren().add(btn2);
        root.getChildren().addAll(btn1, btn2);
        
        Scene scene = new Scene(root);

        primaryStage.setTitle("메인화면");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }


}
