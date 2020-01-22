package com.dupel.lector_tasks_Sasha.task2;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota","Corolla",1.6);
        toyota.setEngineСapacity(2.0);
        Truck volvo = new Truck("Volvo","XC90",5.0,30000);
        volvo.setEmpty(false);
        System.out.println(toyota.toString());
        System.out.println(volvo.toString());

    }
}
