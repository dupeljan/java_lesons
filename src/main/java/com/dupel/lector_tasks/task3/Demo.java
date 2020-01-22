package com.dupel.lector_tasks.task3;


public class Demo {
    public static void main(String[] args) {
       Solute hci = new Solute("Chloride",1234,0.5);
        hci.setConcentration(0.8);
        System.out.println(hci.toString());
    }
}
