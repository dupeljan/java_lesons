package com.dupel.lector_tasks_Sasha.task3;


import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Truck volvo = new Truck("Volvo","XC90",5.0,30000);
        volvo.setEngineСapacity(7.9);
        volvo.setEmpty(false);
        System.out.println(volvo.toString());
    }
}
