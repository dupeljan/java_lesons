package com.dupel.lector_tasks.task2;

public class Solute  extends Liquid{
    private  double concentration;
    private static final double EPS = 1e-15;

    public Solute(String name, double desinty, double concentration) {
        super(name, desinty);
        this.concentration = concentration;
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
        return super.toString() + "Solute{" +
                "concentration=" + concentration +
                '}';
    }
}
