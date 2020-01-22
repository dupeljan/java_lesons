package com.dupel.lector_tasks_Sasha.task1;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Polinomial p1 = new Polinomial(new double[]{1, 1, 1});
        Polinomial p2 = new Polinomial(new double[]{2,3,4});
        System.out.println("P1(2) = " + p1.get(2));
        System.out.println("p1 + p2 = " + p1.add(p2).toString());
        System.out.println("p1 - p2 = " + p1.succ(p2).toString());
        System.out.println("p1 * p2 = " + p1.mul(p2).toString());


    }
}
