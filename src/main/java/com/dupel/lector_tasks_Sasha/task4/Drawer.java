package com.dupel.lector_tasks_Sasha.task4;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.geom.Point2D;

import static java.lang.Math.pow;

public class Drawer extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Creating a Group
        Group root = new Group();

        // Координаты прямоугольника
        int x1=10,x2=500,y1=10,y2=400;
        int n=10,m=25;
        // Главный прямоугольник, в котором содержится элипс
        Rectangle mainR = new Rectangle(x1,y1,x2-x1,y2-y1);
        mainR.setFill(Color.rgb(255,0,0));
        root.getChildren().add(mainR);
        // Овал
        int a = (x2-x1)/3;
        int b = (y2-y1)/4;
        Ellipse mailE = new Ellipse(x1+(x2-x1)/2,y1+(y2-y1)/2,a ,b);
        root.getChildren().add(mailE);
        mailE.setFill(Color.rgb(255,255,255));
        Line[] vertLine  = new Line[n];
        // Прямоугольники внутри
        for(int i = 0; i < n; i++){
            int newX = x1 + i*(x2 - x1)/n;
            vertLine[i] = new Line();
            vertLine[i].setStartX(newX);
            vertLine[i].setStartY(y1);
            vertLine[i].setEndX(newX);
            vertLine[i].setEndY(y2);
            vertLine[i].setFill(Color.rgb(0,0,0));
            root.getChildren().add(vertLine[i]);
        }

        Line[] horLine = new Line[m];
        for(int j = 0; j < m; j++) {
            int newy = y1 + j*(y2 - y1)/m;
            horLine[j] = new Line();
            horLine[j].setStartX(x1);
            horLine[j].setStartY(newy);
            horLine[j].setEndX(x2);
            horLine[j].setEndY(newy);
            horLine[j].setFill(Color.rgb(0,0,0));
            root.getChildren().add(horLine[j]);
        }

        Scene scene = new Scene(root,600,600);
        scene.setFill(Color.TRANSPARENT);
       // stage.initStyle(StageStyle.TRANSPARENT);
       // stage.setScene(scene);


        // Проверим, в каких прямоугольниках есть элипс

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++){
                newRect:
                // Идем по всем точкам прямоугольника
                for(int k = x1 + i*(x2-x1)/n; k < (i+1)*(x2-x1)/n;k++)
                    for(int l = y1 + j*(y2-y1)/m; l < (j+1)*(y2-y1)/m;l++){
                        if( pow(k - (x1 + (x2-x1)/(float)2),2)/(float)pow(a,2) + pow(l-(y1 +(y2-y1)/(float)2),2)/(float)pow(b,2) < 1){
                            //draw rect
                            Rectangle r = new Rectangle(x1 + i*(x2-x1)/n,y1 + j*(y2-y1)/m,(x2-x1)/n,(y2-y1)/m);
                            r.setFill(Color.rgb(0,255,255));
                            root.getChildren().add(r);
                            break newRect;
                        }
                    }

            }

//            for(int i = x1; i < x2;i++)
//                for(int j = y1; j < y2; j++)
//                    if(pow(i - (x1 + (x2-x1)/(float)2),2)/(float)pow(a,2) + pow(j-(y1 +(y2-y1)/(float)2),2)/(float)pow(b,2) < 1){
//                        Line l = new Line(i,j,i,j);
//                        root.getChildren().add(l);
//                    }
//




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
