package com.dupel.lector_tasks.task4;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.*;
import javafx.scene.shape.Polygon;


import static java.lang.Math.*;

public class Triangle {
    private static final double  EPS = 1e-15;
    private Point2D x,y,z;
    Polygon polygon;
    enum TriangleType {rectangular, acuteAngled, obtuse}
    TriangleType currType;


    public Triangle(Point2D x, Point2D y, Point2D z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private void swap(double a, double b) {
        double temp = a;
        a = b;
        b = temp;
    }
    public TriangleType getType(){
        // Вычисляем большую сторону
        double AB = x.distance(y);
        double BC = y.distance(z);
        double AC = z.distance(x);
        double m = max(max(AB,BC),AC);
        if (BC == m){
            swap(AB,BC);
        }else if (AC == m){
            swap(AB,AC);
        };
        double hypotenuse = pow(BC,2) + pow(AC,2);
        AB = pow(AB,2);
        if ( abs(AB -hypotenuse) < EPS )
            return TriangleType.rectangular;
        if ( AB - hypotenuse > EPS )
            return TriangleType.obtuse;

        return  TriangleType.acuteAngled;
    }


    public Polygon getPolygon(){
        polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                x.getX(), x.getY(),
                y.getX(), y.getY(),
                z.getX(), z.getY()});
        TriangleType t = getType();
        // Если прямоугольный треугольник
        if (t == TriangleType.acuteAngled){
            BufferedImage bufferedImage =
                    new BufferedImage(5, 5, BufferedImage.TYPE_INT_ARGB);

            Graphics2D g2 = bufferedImage.createGraphics();
            g2.setColor(Color.white);
            g2.fillRect(0, 0, 5, 5);
            g2.setColor(Color.black);
            g2.drawLine(0, 0, 5, 5); // \
            g2.drawLine(0, 5, 5, 0); // /

// paint with the texturing brush
            Rectangle2D rect = new Rectangle2D.Double(0, 0, 5, 5);


            //polygon.setColor();

        }
//        Group g = new Group();
//        Line[] LineArr = new Line[3];
//        Point2D[] buffPoints = {x,y,z};
//        for( int i = 0; i < 3; i++ ){
//            LineArr[i] = new Line();
//            LineArr[i].setStartX(buffPoints[i].getX());
//            LineArr[i].setStartY(buffPoints[i].getY());
//            LineArr[i].setEndX(buffPoints[ (i+1) % 3].getX());
//            LineArr[i].setEndY(buffPoints[ (i+1) % 3].getY());
//            g.getChildren().add(LineArr[i]);
//        }
        return  polygon;
    }



}
