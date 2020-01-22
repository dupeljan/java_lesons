package com.dupel.lector_tasks.task2;

public class Liquid {
    private String name;
    private double desinty;

    public Liquid(String name, double desinty) {
        this.name = name;
        this.desinty = desinty;
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

    @Override
    public String toString() {
        return "Liquid{" +
                "name='" + name + '\'' +
                ", desinty=" + desinty +
                '}';
    }
}
