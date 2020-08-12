package com.kodilla.mian;

import javafx.application.Application;
import javafx.stage.Stage;

public class Azul extends Application {
    public static void main (String [] args){
        launch(args);
    }
    @Override
    public void start (Stage primaryStage) throws Exception{

        Graphics graphics = new Graphics();
        graphics.board(primaryStage);
        Logic logic = new Logic();
        logic.start(graphics);
        logic.setWorkshopFirst(true);

//
    }
}
