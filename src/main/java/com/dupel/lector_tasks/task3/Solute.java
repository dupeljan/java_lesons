package com.dupel.lector_tasks.task3;

public class Solute implements LiquidInterface {
    private String name;
    private double desinty;
    private  double concentration;
    private static final double EPS = 1e-15;

    public Solute(String name, double desinty, double concentration) {
        this.name = name;
        this.desinty = desinty;
        this.concentration = concentration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesinty(double desinty) {
        this.desinty = desinty;
    }

    public String getName() {
        return name;
    }

    public double getDesinty() {
        return desinty;
    }
    public double getConcentration() {
        return concentration;
    }

    public void setConcentration(double concentration) {
        if ( EPS < concentration && concentration < 1 + EPS) {
            this.concentration = concentration;
        }else{
            System.out.println("Wrong concentration");
        }
    }

    @Override
    public String toString() {
        return "Solute{" +
                "name='" + name + '\'' +
                ", desinty=" + desinty +
                ", concentration=" + concentration +
                '}';
    }
}
