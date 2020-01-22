package com.dupel.lector_tasks_Sasha.task1;

import java.util.Arrays;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class Polinomial {
    private double[] cooficients;
    private int n;

    public Polinomial(double[] cooficients){
        this.cooficients = cooficients;
        this.n = cooficients.length;
    }

    public double get(double x){
        double res = 0;
        double lx = 1;
        for (double c : cooficients) {
            res += lx * c;
            lx *= x;
        }
        return  res;
    }

    public double[] getCooficients() {
        return cooficients.clone();
    }

    public int length(){
        return cooficients.length;
    }

    public  Polinomial add(Polinomial x){
       double[] newc;
       if (n < x.length())
           newc = x.getCooficients();
       else
           newc = cooficients.clone();
        double[] c = x.getCooficients();
        for(int i = 0; i < min(n,x.length());  i++){
           newc[i] = cooficients[i] + c[i];
       }
        return new Polinomial(newc);
    }

    public Polinomial succ(Polinomial x){
        double[] newc = x.getCooficients();
        for (int i = 0; i < newc.length; i++)
            newc[i] = - newc[i];
        return add(new Polinomial(newc));
    }

    public Polinomial mul(Polinomial x){
        double[] newc = new double[n + x.length() - 1];
        for(int i = 0; i < newc.length; i++)
            newc[i] = 0;
        double[] xc = x.getCooficients();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < x.length(); j++){
                newc[i+j] += cooficients[i] * xc[j];
            }
        return new Polinomial(newc);
    }

    @Override
    public String toString() {
        return "Polinomial{" +
                "cooficients=" + Arrays.toString(cooficients) +
                ", n=" + (n-1) +
                '}';
    }
}
