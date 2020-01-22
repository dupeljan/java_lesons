package com.dupel.ind.cars;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Demo {


    public static void main(String[] args) {
        List<Car> cars;

        Manufacture toyota = new Manufacture("Toyota","Japan","12.03.1950");
        Manufacture lada = new Manufacture("Lada","Russia","12.03.1976");
        Manufacture reno = new Manufacture("Reno","France","12.03.1964");
        Manufacture toyo = new Manufacture("Toyo tires","Japan", "23.12.1990");

        Body mark = new Body(toyota,"0135mark II",1200,"red",4,5);
        Body lada_body = new Body(lada,"1234",5000,"white",3,2);

        Rubber winterToyo = new Rubber(toyo,"Winter breaker",4,"winter");
        Rubber summerToyo = new Rubber(toyo,"Summer breaker",2,"summer");

        Wheel renowheel = new Wheel(reno,"Reno original wheel",7,17,winterToyo);
        Wheel toyotawheel = new Wheel(toyota,"Toyota orig wheel",5,19,summerToyo);

        Lamp toyotalamp = new Lamp(toyota,"Original toyota lamp",1,10);

        cars = Arrays.asList(
                new Car(toyota,"Mark II", Arrays.asList(toyotalamp),toyotawheel,mark,0),
                new Car(lada,"ВАЗ 2107",Arrays.asList(toyotawheel),renowheel,lada_body,10000),
                new Car(reno,"Logan",Arrays.asList(toyotalamp),renowheel,lada_body,495112),
                new Car(reno,"Daster",Arrays.asList(),renowheel,lada_body,213)
        );

        for (Car car : cars){
            System.out.println(car.toString());
        }



    }
}
