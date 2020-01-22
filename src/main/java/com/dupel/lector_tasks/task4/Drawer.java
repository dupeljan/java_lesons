package com.dupel.lector_tasks.task4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.awt.geom.Point2D;


public class Drawer extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        //Creating a line object
        Triangle triangle = new Triangle(new Point2D.Double(100,100), new Point2D.Double(200,200),new Point2D.Double(100,200));

        //Setting the properties to a line

        //Creating a Group
        Group root = new Group(triangle.getPolygon());

        //Creating a Scene
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the scene
        stage.setTitle("Sample application");

        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }

}
