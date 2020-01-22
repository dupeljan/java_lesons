package com.dupel.lector_tasks.task2;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Liquid water = new Liquid("Water",997 );
        Solute  hci = new Solute("Chloride",1234,0.5);
        hci.setConcentration(0.8);
        System.out.println(hci.toString());
    }

}
